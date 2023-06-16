package Hashing;
import java.util.*;

// Hashmap : It is an array of LikedList and takes O(1) time to put, get, remove ... operations.
// It is an unsorted data structure contains key-value pairs. Key should be a unique and value allows duplicates.

public class Hashmap {
    public static void main(String[] args) {
         HashMap<String, Integer> map = new HashMap<>();

         //Adding
        map.put("India", 120);
        map.put("US", 30);
        map.put("China",150);

        System.out.println(map);

        //It will update the value in the hashmap
        map.put("China",180);

        System.out.println(map);


        // Search
        System.out.println(map.containsKey("India")); // returns T or F

        System.out.println(map.get("India")); // If key exist returns value
        System.out.println(map.get("Russia")); // If key does not exist returns null


        //Iteration
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //Alternative approach through keys
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s + " " + map.get(s));
        }


        //Delete
        map.remove("US");
        System.out.println(map);
    }
}
