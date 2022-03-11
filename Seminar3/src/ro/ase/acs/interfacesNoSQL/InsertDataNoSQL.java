package ro.ase.acs.interfacesNoSQL;

public interface InsertDataNoSQL {
    public void insert(MongoDatabase mongoDb, String collection);

}
