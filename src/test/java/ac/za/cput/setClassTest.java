package ac.za.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setClassTest
{
    setClass set = new setClass();

    public boolean setAdd()
    {
        set.clearSet();

        int size = set.getSetSize();
        set.addSet(21);

        if (size < set.getSetSize())
            return true;
        else return false;
    }

    @Test
    void testSetAdd()
    {
        assertEquals(true, this.setAdd());
    }

    public boolean setRemove()
    {
        set.clearSet();

        set.addSet(0);
        set.addSet(3);
        int Size = set.getSetSize();

        set.setRemove(0);
        if (Size == set.getSetSize())
            return false;
        else return true;
    }

    @Test
    void testSetRemove()
    {
        assertNotEquals(false, this.setRemove());
    }

    public boolean setFind()
    {
        set.clearSet();

        set.addSet(2);
        set.addSet(27);

        return set.setFind(2);
    }

    @Test
    void testSetFind()
    {
        assertEquals(true, this.setFind());
    }
}