package ro.ase.acs.nosql;

public class ReadDataNoSQL implements ro.ase.acs.interfacesNoSQL.ReadDataNoSQL {
    @Override
    public void read(MongoDatabase mongoDb, String collection) {
        MongoCollection<Document> mongoCollection = mongoDb.getCollection(collection);
        FindIterable<Document> result = mongoCollection.find();
        for (Document doc : result) {
            System.out.println(doc);
        }
    }
}
