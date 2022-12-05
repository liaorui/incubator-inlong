package org.apache.inlong.sort.iceberg.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcConnectionPool {

    // base connection params
    private final String driver;
    private final String url;
    private final String user;
    private final String password;
    private final int maxPoolSize;

    // connections params
    private final List<Connection> connections;
    private final List<Connection> usedConnections = new ArrayList<>();

    // default limit params
    private static int INIT_POOL_SIZE = 10;
    private static int MAX_TIMEOUT = 3000;

    // init pool
    private static volatile JdbcConnectionPool connectionPool;

    private JdbcConnectionPool(String driver, String url, String user, String password, List<Connection> connections) {
        this.url = url;
        this.user = user;
        this.driver = driver;
        this.password = password;
        this.connections = connections;
        this.maxPoolSize = MAX_TIMEOUT;
    }

    private JdbcConnectionPool(String driver, String url, String user,
            String password, List<Connection> connections, int maxPoolSize) {
        this.url = url;
        this.user = user;
        this.driver = driver;
        this.password = password;
        this.connections = connections;
        this.maxPoolSize = Math.max(maxPoolSize, INIT_POOL_SIZE);
    }

    public static synchronized JdbcConnectionPool create(String driver, String url, String user, String password)
            throws SQLException, ClassNotFoundException {
        if (connectionPool == null) {
            List<Connection> pool = new ArrayList<>(INIT_POOL_SIZE);
            for (int i = 0; i < INIT_POOL_SIZE; i++) {
                pool.add(createConnection(driver, url, user, password));
            }
            connectionPool = new JdbcConnectionPool(driver, url, user, password, pool);
        }
        return connectionPool;
    }

    public static synchronized JdbcConnectionPool create(String driver, String url, String user, String password,
            int maxPoolSize)
            throws SQLException, ClassNotFoundException {
        if (connectionPool == null) {
            List<Connection> pool = new ArrayList<>(INIT_POOL_SIZE);
            for (int i = 0; i < INIT_POOL_SIZE; i++) {
                pool.add(createConnection(driver, url, user, password));
            }
            connectionPool = new JdbcConnectionPool(driver, url, user, password, pool, maxPoolSize);
        }
        return connectionPool;
    }

    private static JdbcConnectionPool getConnectionPool() {
        return connectionPool;
    }

    public static synchronized Connection getConnection() throws SQLException, ClassNotFoundException {
        JdbcConnectionPool connectionPool = getConnectionPool();
        List<Connection> connections = connectionPool.connections;
        List<Connection> usedConnections = connectionPool.usedConnections;
        if (connections.isEmpty()) {
            if (usedConnections.size() < connectionPool.maxPoolSize) {
                connections.add(createConnection(connectionPool.driver, connectionPool.url,
                        connectionPool.user, connectionPool.password));
            } else {
                throw new RuntimeException(
                        "Maximum pool size reached, no available connections!");
            }
        }

        Connection connection = connections.remove(connections.size() - 1);
        if (!connection.isValid(MAX_TIMEOUT)) {
            connection = createConnection(connectionPool.driver, connectionPool.url,
                    connectionPool.user, connectionPool.password);
        }
        usedConnections.add(connection);
        return connection;
    }

    public static boolean releaseConnection(Connection connection) {
        getConnectionPool().connections.add(connection);
        return getConnectionPool().usedConnections.remove(connection);
    }

    private static Connection createConnection(String driver, String url, String user, String password)
            throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }

    public static void shutdown() throws SQLException {
        JdbcConnectionPool connectionPool = getConnectionPool();
        connectionPool.usedConnections.forEach(JdbcConnectionPool::releaseConnection);
        for (Connection connection : connectionPool.connections) {
            if (connection == null) {
                continue;
            }
            connection.close();
        }
        connectionPool.connections.clear();
    }

    public synchronized int getSize() {
        return getConnectionPool().connections.size() + getConnectionPool().usedConnections.size();
    }
}
