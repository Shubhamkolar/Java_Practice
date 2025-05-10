# Map:
- A Map defines mappings from keys to values.
- The <key, value> pair is called an entry.
- A map does not allow duplicates keys, in other words, the keys are unique.
- Both the keys and the values must be objects, with primitive values being wrapped in their respective primitive wrapper objects when they are put  in a map.
- A map is not a collection and the Map interface does not extend the Collection interface.
- However, the mappings can be viewed as a collection in various ways: a key set, a value collection, or an entry set. 

## Map Interface Methods:
- Object put(K key, V value)
- Object get(Object key)
- Object remove(Object key)
- boolean containsKey(Object key)
- boolean containsValue(Object value)
- int size()
- boolean isEmpty()

## Bulk Operations:
- void putAll(Map<? extends K, ? extends V> map)
- void clear()
- Set <K> keySet()
- Collection<V> values()
- Set<Map.Entry<K, V>> entrySet()

ex.: 
interface Entry<K, V>{
    K getKey();
    V getValue();
    V setValue(V value);
}

- Each <key, value> in the entry set view is represented by an object implementing the nested Map.
- An entry in the entry set view can be manipulated by methods defined in this interface. 

-----------------------------------------------------------------------------------------------------------------
# IMPLEMENTATION OF MAPS 
- The classes HashMap and Hashtable implement unordered maps. The class LinkedHashMap implements ordered maps.
- The class TreeMap implements sorted maps.
- While the HashMap class is not thread-safe and permits one null key, the Hashtable class is thread-safe and permits non-null keys and values only.
- The thread-safety provided by the Hashtable class comes with a performance penalty. 
- However, a LinkedHashMap can also maintain its elements in (element) access order, that is, the order in which its entries are accesses, from least-recently
  accessed to most-recently accessed entries.
- This ordering mode can be specific in one of the constructors of the LinkedHashMap class (LRU cache).
- Both the HashMap and the LinkedHashMap classes provide comparable performance, but the HashMap class is the natural choice if ordering is not an issue.
- Operations such as adding, removing, or finding an entry based on a key are in constant time, as these hash the key.
- Operations such as finding the entry with a particular value are in linear time, as these involve searching through the entries.
- Adding, removing, and finding entries in a LinkedHashMap can be slightly slower than in a HashMap, as an ordered doubly-linked list has to  be maintained.
- Traversal of a map is through one of its collection-views. For an underlying LinkedHashMap, the traversal time is proportional to the size of the map-regardless of its capacity.


-----------------------------------------------------------------------------------------------------------------
# Sorted Map:
- The SortedMap and NavigableMap interfaces are the analogs of the SortedSet and the NavigableSet interfaces, respectively.
- The SortedMap interface extends the Map interface to provide the functionality for implementing maps with sorted keys.
  Its operations are analogous to those of the SortedSet interface. 
- SortedMap interface Methods:
  K firstKey() Sorted set: first()
  K lastKey() Sorted set: last()


-----------------------------------------------------------------------------------------------------------------
# NavigableMap: 
- NavigableMap interface extends the SortedMap interface with navigation methods to find the closet matches for specific targets.
- In addition to the methods of the SortedMap interface, the NavigableMap interface adds the new methods, analogous to the 
  NavigableSet interface.
- First-last elements
  Map.Entry<K, V> pollFirstEntry() Navigable set: pollFirst()
  Map.Entry<K, V> pollLastEntry() Navigable set: pollLast()
  Map.Entry<K, V> firstEntry()
  Map.Entry<K, V> lastEntry()

Closest-Matches:
  Map.Enty<K, V> ceilingEntry<K key> Navigable set: ceiling()  
  K ceilingKey(K key)
  Map.Entry<K, V> floorEntry(K key) Navigable set: floor()
  K floorKey(K key)
  Map.Entry<K, V> higherEntry(K key) Navigable set: higher()
  K higherKey(K key)
  Map.Entry<K, V> lowerEntry(K key) Navigable set: lower()
  K lowerKey(K key)


-----------------------------------------------------------------------------------------------------------------
# TreeMap:
- The TreeMap class implements the NavigableMap interface, and thereby the SortedMap interface
- By default, operations on sorted maps rely on the natural ordering of the keys.
- However, a total ordering can be specified by passing a customized comparator to the constructor.
- The TreeMap implementation uses balanced trees, which deliver excellent performance for all operations.
- However, searching in a HashMap can be faster than in a TreeMap, as hashing algorithms usually offer better
  performance than the search algorithms for balanced trees.
  