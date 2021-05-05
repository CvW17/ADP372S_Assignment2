package ac.za.cput;

import java.util.*;

public class listClass
{
    private List<String> list=new ArrayList<String>();

    public void addList(String add)
    {
        list.add(add);
    }

    public int getListSize()
    {
        return list.size();
    }

    public void listRemove(int index)
    {
        list.remove(index);
    }

    public String listFind(int index)
    {
        return list.get(index);
    }

    public void clearList()
    {
        list.clear();
    }
}
