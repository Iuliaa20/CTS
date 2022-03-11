package ro.ase.acs.interfacesSQL;

import java.sql.Connection;
import java.sql.SQLException;

public interface OpenConnection {
    public Connection openConnection() throws SQLException, ClassNotFoundException;
}
