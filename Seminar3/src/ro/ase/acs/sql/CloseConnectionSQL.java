package ro.ase.acs.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class CloseConnectionSQL implements ro.ase.acs.interfacesSQL.CloseConnectionSQL {
    @Override
    public void closeConnectionSQL(Connection connection) throws SQLException {
        connection.close();
    }
}
