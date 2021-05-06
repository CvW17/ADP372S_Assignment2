package ac.za.cput;

import java.util.*;

public class mapClass
{
    private Map<Integer, String> map=new HashMap<Integer, String>();

    public void mapCLear()
    {
        map.clear();
    }

    public int mapSize()
    {
        return map.size();
    }

    public void mapAdd(int key, String value)
    {
        map.put(key, value);
    }

    public boolean addMapTest()
    {
        return map.isEmpty();
    }

    public void mapRemove(int key)
    {
        map.remove(key);
    }

    public boolean mapFind(int key)
    {
        return map.containsKey(key);
    }
}
