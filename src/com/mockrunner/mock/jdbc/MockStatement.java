package com.mockrunner.mock.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

/**
 * Mock implementation of <code>Statement</code>.
 */
public class MockStatement implements Statement
{
    private MockResultSet resultSet = null;
    private int querySeconds = 0;
    private int maxRows = 0;
    private int maxFieldSize = 0;
    private int fetchDirection = ResultSet.FETCH_FORWARD;
    private int fetchSize = 0;
    private int resultSetType = ResultSet.TYPE_FORWARD_ONLY;
    private int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
    private int resultSetHoldability = ResultSet.HOLD_CURSORS_OVER_COMMIT;
    private Connection connection;
    
    public MockStatement(Connection connection)
    {
        this(connection, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
    }
    
    public MockStatement(Connection connection, int resultSetType, int resultSetConcurrency)
    {
        this(connection, resultSetType, resultSetConcurrency, ResultSet.HOLD_CURSORS_OVER_COMMIT);
    }
    
    public MockStatement(Connection connection, int resultSetType, int resultSetConcurrency, int resultSetHoldability)
    {
        this.connection = connection;
        this.resultSetType = resultSetType;
        this.resultSetConcurrency = resultSetConcurrency;
        this.resultSetHoldability = resultSetHoldability;
    }
    
    public void setResultSet(MockResultSet resultSet)
    {
        this.resultSet = resultSet;
    }
    
    public ResultSet executeQuery(String sql) throws SQLException
    {
        return null;
    }

    public int executeUpdate(String sql) throws SQLException
    {
        return 0;
    }

    public void close() throws SQLException
    {

    }

    public int getMaxFieldSize() throws SQLException
    {
        return maxFieldSize;
    }

    public void setMaxFieldSize(int maxFieldSize) throws SQLException
    {
        this.maxFieldSize = maxFieldSize;
    }

    public int getMaxRows() throws SQLException
    {
        return maxRows;
    }

    public void setMaxRows(int maxRows) throws SQLException
    {
        this.maxRows = maxRows;
    }

    public void setEscapeProcessing(boolean enable) throws SQLException
    {

    }

    public int getQueryTimeout() throws SQLException
    {
        return querySeconds;
    }

    public void setQueryTimeout(int querySeconds) throws SQLException
    {
        this.querySeconds = querySeconds;
    }

    public void cancel() throws SQLException
    {

    }

    public SQLWarning getWarnings() throws SQLException
    {
        return null;
    }

    public void clearWarnings() throws SQLException
    {

    }

    public void setCursorName(String name) throws SQLException
    {

    }

    public boolean execute(String sql) throws SQLException
    {
        return false;
    }

    public ResultSet getResultSet() throws SQLException
    {
        return null;
    }

    public int getUpdateCount() throws SQLException
    {
        return -1;
    }

    public boolean getMoreResults() throws SQLException
    {
        return false;
    }

    public void setFetchDirection(int fetchDirection) throws SQLException
    {
        this.fetchDirection = fetchDirection;
    }

    public int getFetchDirection() throws SQLException
    {
        return fetchDirection;
    }

    public void setFetchSize(int fetchSize) throws SQLException
    {   
        this.fetchSize = fetchSize;
    }

    public int getFetchSize() throws SQLException
    {
        return fetchSize;
    }

    public void addBatch(String sql) throws SQLException
    {

    }

    public void clearBatch() throws SQLException
    {

    }

    public int[] executeBatch() throws SQLException
    {
        return null;
    }

    public Connection getConnection() throws SQLException
    {
        return connection;
    }

    public boolean getMoreResults(int current) throws SQLException
    {
        return false;
    }

    public ResultSet getGeneratedKeys() throws SQLException
    {
        return null;
    }

    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException
    {
        return 0;
    }

    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException
    {
        return 0;
    }

    public int executeUpdate(String sql, String[] columnNames) throws SQLException
    {
        return 0;
    }

    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException
    {
        return false;
    }

    public boolean execute(String sql, int[] columnIndexes) throws SQLException
    {
        return false;
    }

    public boolean execute(String sql, String[] columnNames) throws SQLException
    {
        return false;
    }
    
    public int getResultSetType() throws SQLException
    {
        return resultSetType;
    }
    
    public int getResultSetConcurrency() throws SQLException
    {
        return resultSetConcurrency;
    }
    
    public int getResultSetHoldability() throws SQLException
    {
        return resultSetHoldability;
    }
}
