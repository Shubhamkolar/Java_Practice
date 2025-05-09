package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMaps {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();
        map.put("Shubham", 1);
        map.put("Tejam", 2);
        map.put("Ravi", 3);
        map.put("Ravi", 3); // Will be ignored since its duplicate
        map.put("Rohit", 4);
    
        System.out.println(map);

        map.remove("Rohit");
        System.out.println(map.getOrDefault("Rohit", 0)); // This is used to avoid any exceptions if the value don't exists
        System.out.println(map.getOrDefault("Shubham", 1));

        System.out.println(map.containsKey("Tejam"));
        System.out.println("--------------------------------------------------------");

// The entrySet() method of the Map interface returns a Set of key-value pairs. It's commonly 
// used when you want to iterate over both keys and values at the same time.

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet)
            System.out.println(entry.getKey() + ", " + entry.getValue());

// The keySet() methods returns a Set of all keys in the map. It allows you to iterate over the keys and
// across values using get(key).
        Set<String> keySets = map.keySet();
        for(String key : keySets){
            System.out.println(key + ", " + map.get(key)); // need to call map.get(key) for values to get
        }

// LinkedHashMap is just get the ordering elements and implement the same methods. 

        System.out.println("--------------------------------------------------------");
// ------------------------------------------------------NavigableMap--------------------------------------------------------

        NavigableMap<Integer, String> tmap = new TreeMap<>();
//      NavigableMap<Integer, String> tmap = new TreeMap<>((a, b) -> b - a); for descending order use this way
        tmap.put(11, "Om");
        tmap.put(1, "Ketan");
        tmap.put(99, "Rohya");

        System.out.println("Tree map shows output as " + tmap); // Natural ordering (asceding order)
        
        Set<Map.Entry<Integer, String>> eSet = tmap.entrySet();
        for(Map.Entry<Integer, String> entry : eSet)
            System.out.println(entry.getKey() + ", " + entry.getValue());

        System.out.println(tmap.pollFirstEntry());
        System.out.println(tmap.pollLastEntry());

        };

    }
    

