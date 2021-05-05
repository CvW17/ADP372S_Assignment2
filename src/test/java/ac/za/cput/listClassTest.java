package ac.za.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class listClassTest
{
    listClass list = new listClass();

    public boolean ListAdd()
    {
        list.clearList();

        int Size = list.getListSize();
        list.addList("Zero");

        if (Size != list.getListSize())
            return true;
        else return false;
    }

    @Test
    void testListAdd()
    {
        assertEquals(true, this.ListAdd());
    }

    public boolean ListRemove()
    {
        list.clearList();

        int Size = list.getListSize();
        list.addList("Zero");

        list.listRemove(0);
        if (Size == list.getListSize())
            return true;
        else return false;
    }

    @Test
    void TestListRemove()
    {
        assertEquals(true, this.ListRemove());
    }

    public String listFind()
    {
        list.clearList();

        list.addList("Zero");
        list.addList("One");
        list.addList("Two");

        return list.listFind(1);
    }

    @Test
    void testListFind()
    {
        assertNotNull(this.listFind());
    }
}