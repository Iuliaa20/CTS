package ro.ase.acs.interfacesNoSQL;

public interface CloseConnection {
    public void close(MongoClient mongoClient);
}
