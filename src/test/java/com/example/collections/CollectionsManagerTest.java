package com.example.collections;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsManagerTest {

    @Test
    public void testListOperations() {
        CollectionsManager mgr = new CollectionsManager();
        mgr.addToArrayList("x");
        mgr.addToArrayList("y");
        mgr.addToArrayList("x");

        assertTrue(mgr.containsInArrayList("y"));
        assertEquals(3, mgr.getArrayListSnapshot().size());

        assertTrue(mgr.removeFromArrayList("y"));
        assertFalse(mgr.containsInArrayList("y"));
    }

    @Test
    public void testSetOperations() {
        CollectionsManager mgr = new CollectionsManager();
        assertTrue(mgr.addToHashSet("a"));
        assertFalse(mgr.addToHashSet("a"));
        assertTrue(mgr.containsInHashSet("a"));
        assertTrue(mgr.removeFromHashSet("a"));
        assertFalse(mgr.containsInHashSet("a"));

        assertTrue(mgr.addToTreeSet("b"));
        assertTrue(mgr.containsInTreeSet("b"));
    }

    @Test
    public void testMapOperations() {
        CollectionsManager mgr = new CollectionsManager();
        Person p = new Person("K1", "Carl");
        mgr.putInHashMap(p.getId(), p);
        assertTrue(mgr.containsKeyInHashMap("K1"));
        assertEquals(p, mgr.getFromHashMap("K1"));
        assertEquals(p, mgr.removeFromHashMap("K1"));
        assertNull(mgr.getFromHashMap("K1"));

        mgr.putInTreeMap("Z", new Person("Z", "Zed"));
        Map<String, Person> snapshot = mgr.getTreeMapSnapshot();
        assertTrue(snapshot.containsKey("Z"));
    }

    @Test
    public void testSearchByPrefix() {
        CollectionsManager mgr = new CollectionsManager();
        mgr.addToArrayList("apple");
        mgr.addToArrayList("application");
        mgr.addToArrayList("banana");
        List<String> found = mgr.searchInArrayListByPrefix("app");
        assertEquals(2, found.size());
    }
}