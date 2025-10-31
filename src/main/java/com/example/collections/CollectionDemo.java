package com.example.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionDemo {
    public static void main(String[] args) {
        CollectionsManager mgr = new CollectionsManager();

        System.out.println("--- List (ArrayList) demo ---");
        mgr.addToArrayList("apple");
        mgr.addToArrayList("banana");
        mgr.addToArrayList("apple"); // duplicate allowed
        System.out.println("ArrayList contents: " + mgr.getArrayListSnapshot());
        System.out.println("Contains 'banana'? " + mgr.containsInArrayList("banana"));
        mgr.removeFromArrayList("banana");
        System.out.println("After removal: " + mgr.getArrayListSnapshot());

        System.out.println("\n--- Set (HashSet & TreeSet) demo ---");
        boolean added1 = mgr.addToHashSet("apple");
        boolean added2 = mgr.addToHashSet("apple"); // duplicate -> false
        mgr.addToHashSet("cherry");
        System.out.println("HashSet contents: " + mgr.getHashSetSnapshot() + " (added1=" + added1 + ", added2=" + added2 + ")");

        mgr.addToTreeSet("dog");
        mgr.addToTreeSet("cat");
        System.out.println("TreeSet (sorted) contents: " + mgr.getTreeSetSnapshot());

        System.out.println("\n--- Map (HashMap & TreeMap) demo ---");
        Person p1 = new Person("ID01", "Alice");
        Person p2 = new Person("ID02", "Bob");
        mgr.putInHashMap(p1.getId(), p1);
        mgr.putInHashMap(p2.getId(), p2);
        System.out.println("HashMap contents: " + mgr.getHashMapSnapshot());
        System.out.println("Get ID01: " + mgr.getFromHashMap("ID01"));

        mgr.putInTreeMap(p2.getId(), p2);
        System.out.println("TreeMap contents (sorted by key): " + mgr.getTreeMapSnapshot());

        System.out.println("\n--- Search example (lists) ---");
        mgr.addToArrayList("ant");
        mgr.addToArrayList("anchor");
        List<String> prefixResult = mgr.searchInArrayListByPrefix("an");
        System.out.println("Items starting with 'an': " + prefixResult);
    }
}