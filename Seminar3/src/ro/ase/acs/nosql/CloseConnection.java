package ro.ase.acs.nosql;

public class CloseConnection implements ro.ase.acs.interfacesNoSQL.CloseConnection {
    @Override
    public void close(MongoClient mongoClient) {
        mongoClient.close();
    }
}
