package ac.za.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class collectionClassTest
{
    collectionClass collection = new collectionClass();

    @Test
    void testCollectionAdd()
    {
        collection.collectionClear();

        collection.collectionAdd("One");
        collection.collectionAdd("Two");

        assertEquals(false, collection.collectionAddTest());
    }

    @Test
    void testCollectionRemove()
    {
        collection.collectionClear();

        collection.collectionAdd("One");
        collection.collectionAdd("Two");
        int size = collection.collectionSize();

        collection.collectionRemove("One");

        assertNotEquals(size, collection.collectionSize());
    }

    @Test
    void testCollectionFind()
    {
        collection.collectionClear();

        collection.collectionAdd("Zero");
        collection.collectionAdd("One");
        collection.collectionAdd("Two");

        assertEquals(true, collection.collectionFind("Zero"));
    }
}