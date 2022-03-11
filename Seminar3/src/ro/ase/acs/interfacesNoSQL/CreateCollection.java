package ro.ase.acs.interfacesNoSQL;

public interface CreateCollection {
    public void createCollection(MongoDatabase mongoDb, String collection);
}
