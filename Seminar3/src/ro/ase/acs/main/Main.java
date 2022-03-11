package ro.ase.acs.main;

import ro.ase.acs.nosql.*;
import ro.ase.acs.sql.*;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String table = "employees";
        try {
            OpenConnection sqlConnection = new OpenConnection();
            Connection connection = null;
            connection = sqlConnection.openConnection();
            CreateTable createTableSQL = new CreateTable();
            createTableSQL.createTable(connection, table);
            InsertData insertSQL = new InsertData();
            insertSQL.insert(connection, table);
            ReadData readSQL = new ReadData();
            readSQL.readData(connection, table);
            CloseConnectionSQL closeConnectionSQL = new CloseConnectionSQL();
            closeConnectionSQL.closeConnectionSQL(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String collection = "employees";
        OpenConnectionNoSQL openConnectionNoSQL = new OpenConnectionNoSQL();
        MongoClient mongoClient = openConnectionNoSQL.openConnection();
        MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
        CreateCollection createTableNoSQL = new CreateCollection();
        createTableNoSQL.createTable(mongoDatabase, collection);
        InsertDataNoSQL insertDataNoSQL = new InsertDataNoSQL();
        insertDataNoSQL.insert(mongoDatabase, collection);
        ReadDataNoSQL readDataNoSQL = new ReadDataNoSQL();
        readDataNoSQL.read(mongoDatabase, collection);
        CloseConnection closeConnection = new CloseConnection();
        closeConnection.close(mongoClient);
    }
}
}
