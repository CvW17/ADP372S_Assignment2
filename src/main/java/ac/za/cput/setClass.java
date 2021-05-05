package ac.za.cput;

import java.util.*;

public class setClass
{
    private Set<Integer> set = new HashSet<Integer>();

    public int getSetSize()
    {
        return set.size();
    }

    public void clearSet()
    {
        set.clear();
    }

    public void addSet(int add)
    {
        set.add(add);
    }

    public void setRemove(int index)
    {
        set.remove(index);
    }

    public boolean setFind(int find)
    {
        return set.contains(find);
    }
}
