package ro.ase.acs.interfacesNoSQL;

public interface ReadDataNoSQL {
    public void read(MongoDatabase mongoDb, String collection);

}
