package hashmap;

import java.util.ArrayList;
import java.util.List;

// A custom HashMap-like class using Generics: K - Key, V - Value

public class OurMap<K, V> {

    // The underlying storage for buckets - each element points to a linked list of MapNode entries
    private List<MapNode<K, V>> bucket;
    
    // Total number of buckets (capacity of the ArrayList)
    private int capacity; // Length of the bucket
    
    // Number of key-value pairs stored in the map
    private int size; // number of elements in the map
    
    // Default initial capacity
    private final int INITIAL_CAPACITY = 5; // Initial length of the bucket array

    // Constructor initializes the bucket list with null values
    public OurMap() {
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for (int i = 0; i < capacity; i++)
            bucket.add(null); // initially, all buckets are empty..
    }

    // This method computes the bucket index using key's hashCode
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode(); // generates hashCode of the key
        return hashCode % capacity; // compresses the hashCode into bucket range
    }

    // Retrieves the value for the given key
    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);

        // Traverse the linked list at the index to find the key
        while (head != null) {
            if (head.key.equals(key))
                return head.value;   // Return value if key matches
            head = head.next;
        }
        return null;  // Key not found
    }

    // Adds a new key-value pair or updates existing key
    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        
        // Check if key already exists and update value
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // If new key, increment size and insert at head of linked list
        size++;

        MapNode<K, V> newEntry = new MapNode<K, V>(key, value);
        head = bucket.get(bucketIndex);
        newEntry.next = head;   // Point new node to previous head
        bucket.set(bucketIndex, newEntry);  // Set new node as head

        // Calculate load factor
        double loadFactory = (1.0 * size) / capacity;
        System.out.println("Inserting key " + key);
        System.out.println("Load Factor :" + loadFactory);

        // If load factor exceeds threshold, rehash
        if (loadFactory > 0.7)
            rehash();
    }

    // Rehashing: doubles the bucket array and re-distributes existing entries
    private void rehash() {
        System.out.println("---------------Rehashing buckets---------------------");
        List<MapNode<K, V>> temp = bucket; // store current bucket
        bucket = new ArrayList<>();
        capacity *= 2; // double the capacity

    //     // Initialize new bucket with null values
    //     for (int i = 0; i < capacity; i++) {
    //         MapNode<K, V> head = temp.get(i);
    //         while (head != null) {
    //             put(head.key, head.value);
    //             head = head.next;
    //         }
    //     }
    // }


  // Initialize new bucket with null values
  for (int i = 0; i < capacity; i++) {
    bucket.add(null);
}

size = 0; // reset size and re-insert all entries

// Re-insert each key-value pair into new bucket list
for (MapNode<K, V> headNode : temp) {
    while (headNode != null) {
        put(headNode.key, headNode.value); // rehash individual node
        headNode = headNode.next;
    }
}
}




    // Removes a key-value pair from the map
    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    bucket.set(bucketIndex, head.next);
                else
                    prev.next = head.next;
                head.next = null;
                size--;
                break;
            }
            prev = head;
            head = head.next;
        }
    }

    // Node class used for each key-value pair in the map
    private class MapNode<K, V> {
        K key;
        V value;
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}