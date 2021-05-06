package ac.za.cput;

import java.util.*;

public class collectionClass
{
    private Collection<String> collection= new TreeSet<String>();

    public void collectionClear()
    {
        collection.clear();
    }

    public int collectionSize()
    {
        return collection.size();
    }

    public void collectionAdd(String add)
    {
        collection.add(add);
    }

    public boolean collectionAddTest()
    {
        return collection.isEmpty();
    }

    public void collectionRemove(String value)
    {
        collection.remove(value);
    }

    public boolean collectionFind(String value)
    {
        return collection.contains(value);
    }
}
