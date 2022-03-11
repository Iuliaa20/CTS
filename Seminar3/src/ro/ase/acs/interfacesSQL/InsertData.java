package ro.ase.acs.interfacesSQL;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertData {
    public void insert(Connection connection, String table) throws SQLException;
}
