package ro.ase.acs.nosql;

public class CreateCollection implements ro.ase.acs.interfacesNoSQL.CreateCollection {

    @Override
    public void createCollection(MongoDatabase mongoDb, String collection) {
        if (mongoDb.getCollection(collection) != null) {
            mongoDb.getCollection(collection).drop();
        }
        mongoDb.createCollection(collection);
    }
}
