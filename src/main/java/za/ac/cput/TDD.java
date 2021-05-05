package za.ac.cput;

import java.util.*;

public class TDD
{
    private List<String> list=new ArrayList<String>();

    public void addList(String add)
    {
        list.clear();
        list.add(add);
    }

    public int getListSize()
    {
        return list.size();
    }

    public void clearList()
    {
        list.remove(0);
    }
}
