package Db;

import Query.Query.Query;

public class MongoDbAccess implements DbAccessInterface
{
    private static MongoDbAccess _instance;

    private MongoDbAccess()
    {
    }

    public static MongoDbAccess getInstance()
    {
        if (MongoDbAccess._instance == null)
            MongoDbAccess._instance = new MongoDbAccess();

        return MongoDbAccess._instance;
    }

    @Override
    public void read(Query query)
    {

    }

    @Override
    public void create(Query query)
    {

    }

    @Override
    public void update(Query query)
    {

    }

    @Override
    public void delete(Query query)
    {

    }
}