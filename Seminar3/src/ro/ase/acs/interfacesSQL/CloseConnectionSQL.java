package ro.ase.acs.interfacesSQL;

import java.sql.Connection;
import java.sql.SQLException;

public interface CloseConnectionSQL {
    public void closeConnectionSQL(Connection connection) throws SQLException;
}
