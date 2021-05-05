package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class TDDTest
{
    TDD tdd = new TDD();

    public boolean ListAdd()
    {

        int Size = tdd.getListSize();
        tdd.addList("Zero");

        if (Size != tdd.getListSize())
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
        int Size = tdd.getListSize();
        tdd.addList("Zero");

        tdd.clearList();
        if (Size == tdd.getListSize())
            return true;
        else return false;
    }

    @Test
    void TestListRemove()
    {
        assertEquals(true, this.ListRemove());
    }
}