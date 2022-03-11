package ro.ase.acs.nosql;

public class OpenConnectionNoSQL implements ro.ase.acs.interfacesNoSQL.OpenConnectionNoSQL {

    @Override
    public MongoClient openConnection() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDb = mongoClient.getDatabase("test");
        return mongoClient;
    }
}
