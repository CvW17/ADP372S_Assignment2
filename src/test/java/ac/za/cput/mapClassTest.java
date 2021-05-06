package ac.za.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mapClassTest
{
    mapClass map = new mapClass();

    @Test
    void testMapAdd()
    {
        map.mapClear();

        map.mapAdd(1, "One");
        map.mapAdd(2, "Two");

        assertEquals(false, map.addMapTest());
    }

    @Test
    void testMapRemove()
    {
        map.mapClear();

        map.mapAdd(1, "One");
        map.mapAdd(2, "Two");
        int size = map.mapSize();

        map.mapRemove(1);

        assertNotEquals(size, map.mapSize());
    }

    @Test
    void testMapFind()
    {
        map.mapClear();

        map.mapAdd(1, "One");
        map.mapAdd(2, "Two");

        assertEquals(true, map.mapFind(2));
    }
}