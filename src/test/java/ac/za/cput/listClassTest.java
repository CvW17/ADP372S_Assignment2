package ac.za.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class listClassTest
{
    listClass list = new listClass();

    public boolean ListAdd()
    {

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
        int Size = list.getListSize();
        list.addList("Zero");

        list.clearList();
        if (Size == list.getListSize())
            return true;
        else return false;
    }

    @Test
    void TestListRemove()
    {
        assertEquals(true, this.ListRemove());
    }
}