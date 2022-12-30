/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.inlong.sort.iceberg.actions;

import org.apache.commons.lang3.StringUtils;
import org.apache.iceberg.Table;
import org.apache.iceberg.actions.RewriteDataFiles;
import org.apache.iceberg.expressions.Expression;
import org.apache.inlong.sort.iceberg.thread.TaskRunService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Do rewrite action with dlc Spark SQL.
 */
public class SyncRewriteDataFilesAction implements RewriteDataFiles {

    private static final Logger LOG = LoggerFactory.getLogger(SyncRewriteDataFilesAction.class);
    private static final String DLC_JDBC_CLASS = "com.tencent.cloud.dlc.jdbc.DlcDriver";

    private SyncRewriteDataFilesActionOption options;
    private AtomicInteger snapshotCounter;
    private transient Table table;

    public SyncRewriteDataFilesAction(SyncRewriteDataFilesActionOption actionOption, Table table) {
        this.snapshotCounter = new AtomicInteger();
        this.options = actionOption;
        this.table = table;
        CompactTableProperties.TABLE_AUTO_COMPACT_PROPERTIES.stream()
                .forEach(k -> Optional.ofNullable(table.properties().get(k))
                        .ifPresent(v -> options.option(k, v)));
    }

    @Override
    public SyncRewriteDataFilesAction option(String name, String value) {
        this.options.option(name, value);
        return this;
    }

    @Override
    public SyncRewriteDataFilesAction options(Map<String, String> options) {
        this.options.options(options);
        return this;
    }

    @Override
    public RewriteDataFiles binPack() {
        return this;
    }

    @Override
    public RewriteDataFiles filter(Expression expression) {
        return this;
    }

    @Override
    public RewriteDataFiles snapshotProperty(String s, String s1) {
        return this;
    }

    @Override
    public RewriteDataFiles.Result execute() {

        TaskRunService.execute(() -> {
            executeCompact();
        });
        return null;
    }

    public void executeCompact() {
        if (!shouldExecute()) {
            LOG.info("Skip This compact.");
            return;
        }

        String rewriteTableSql = options.rewriteSql(table);
        if (StringUtils.isBlank(rewriteTableSql)) {
            LOG.error("Can't parser rewriteTableSql");
            return;
        }

        Connection connection = buildConnection();
        if (connection == null) {
            LOG.error("Can't get DLC JDBC Connection");
            return;
        }
        try {
            Statement statement = connection.createStatement();
            LOG.info("Do compact: {}", rewriteTableSql);
            boolean firstIsResultSet = statement.execute(rewriteTableSql);

            if (false) { // todo:It can be configured as synchronous or asynchronous. Obtaining ResultSet is
                // synchronous, and not obtaining it is only asynchronous
                ResultSet rs = statement.getResultSet();
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while (rs.next()) {
                    StringBuilder lineResult = new StringBuilder();
                    for (int i = 1; i <= columnsNumber; i++) {
                        if (i > 1) {
                            lineResult.append(",  ");
                        }
                        lineResult.append(rsmd.getColumnName(i) + ":" + rs.getString(i));
                    }
                    LOG.info("[Result:]{}", lineResult);
                }
            } else {
                LOG.info("[Result:]there has no output.");
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            LOG.warn("[Result:]Execute rewrite sql({}) err.", rewriteTableSql, e);
            return;
        }
        return;
    }

    private boolean shouldExecute() {
        return snapshotCounter.incrementAndGet() % options.interval() == 0;
    }

    private Connection buildConnection() {
        Connection connection = null;
        String url = options.url();
        try {
            Class.forName(DLC_JDBC_CLASS);
            connection = DriverManager.getConnection(
                    url,
                    options.secretId(),
                    options.secretKey());
            // get meta data
            DatabaseMetaData metaData = connection.getMetaData();
            LOG.info("DLC product = {}, DLC jdbc version = {}, DLC jdbc = '{}'",
                    metaData.getDatabaseProductName(), metaData.getDriverMajorVersion(), url);
        } catch (SQLException e) {
            LOG.error("Create connection err.Please check configuration. Request URL: {}.", url, e);
        } catch (ClassNotFoundException e) {
            LOG.error("DLC JDBC Driver class not found.Please check classpath({}).",
                    System.getProperty("java.class.path"), e);
        }
        return connection;
    }
}
