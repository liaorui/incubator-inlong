package org.apache.inlong.sort.iceberg.actions;

import org.apache.iceberg.Table;
import org.apache.iceberg.actions.RewriteDataFiles;
import org.apache.inlong.sort.iceberg.FlinkActions;

import java.util.Map;

public class SparkActions implements FlinkActions {
    private static final long serialVersionUID = 1L;

    private Map<String, String> actionProperties;

    @Override
    public void init(Map<String, String> actionProperties) {
        this.actionProperties = actionProperties;
    }

    @Override
    public RewriteDataFiles rewriteDataFiles(Table table) {
        return new SyncRewriteDataFilesAction(
                new SyncRewriteDataFilesActionOption(actionProperties),
                table);
    }
}
