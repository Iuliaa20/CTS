package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable implements ro.ase.acs.interfacesSQL.CreateTable {
    @Override
    public void createTable(Connection connection, String table) throws SQLException {
        String sqlDrop = "DROP TABLE IF EXISTS" + table;
        String sqlCreate = "CREATE TABLE" + table + "(id INTEGER PRIMARY KEY," +
                "name TEXT, address TEXT, salary REAL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sqlDrop);
        statement.executeUpdate(sqlCreate);
        statement.close();
        connection.commit();
    }
}
