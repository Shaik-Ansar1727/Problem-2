package com.example.collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsManager {

    private final List<String> arrayList = new ArrayList<>();
    private final List<String> linkedList = new LinkedList<>();

    private final Set<String> hashSet = new HashSet<>();
    private final Set<String> treeSet = new TreeSet<>();

    private final Map<String, Person> hashMap = new HashMap<>();
    private final Map<String, Person> treeMap = new TreeMap<>();

    public void addToArrayList(String item) { arrayList.add(item); }
    public boolean removeFromArrayList(String item) { return arrayList.remove(item); }
    public boolean containsInArrayList(String item) { return arrayList.contains(item); }
    public List<String> getArrayListSnapshot() { return new ArrayList<>(arrayList); }

    public void addToLinkedList(String item) { linkedList.add(item); }
    public boolean removeFromLinkedList(String item) { return linkedList.remove(item); }
    public boolean containsInLinkedList(String item) { return linkedList.contains(item); }
    public List<String> getLinkedListSnapshot() { return new LinkedList<>(linkedList); }

    public boolean addToHashSet(String item) { return hashSet.add(item); }
    public boolean removeFromHashSet(String item) { return hashSet.remove(item); }
    public boolean containsInHashSet(String item) { return hashSet.contains(item); }
    public Set<String> getHashSetSnapshot() { return new HashSet<>(hashSet); }

    public boolean addToTreeSet(String item) { return treeSet.add(item); }
    public boolean removeFromTreeSet(String item) { return treeSet.remove(item); }
    public boolean containsInTreeSet(String item) { return treeSet.contains(item); }
    public Set<String> getTreeSetSnapshot() { return new TreeSet<>(treeSet); }

    public void putInHashMap(String key, Person value) { hashMap.put(key, value); }
    public Person getFromHashMap(String key) { return hashMap.get(key); }
    public Person removeFromHashMap(String key) { return hashMap.remove(key); }
    public boolean containsKeyInHashMap(String key) { return hashMap.containsKey(key); }
    public Map<String, Person> getHashMapSnapshot() { return new HashMap<>(hashMap); }

    public void putInTreeMap(String key, Person value) { treeMap.put(key, value); }
    public Person getFromTreeMap(String key) { return treeMap.get(key); }
    public Person removeFromTreeMap(String key) { return treeMap.remove(key); }
    public boolean containsKeyInTreeMap(String key) { return treeMap.containsKey(key); }
    public Map<String, Person> getTreeMapSnapshot() { return new TreeMap<>(treeMap); }

    public List<String> searchInArrayListByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String s : arrayList) {
            if (s.startsWith(prefix)) {
                result.add(s);
            }
        }
        return result;
    }

}