package CollectionFramework;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Accessing a value using key
        int value = hashMap.get("banana");
        System.out.println("Value associated with key 'banana': " + value);

        // Checking if a key is present
        System.out.println("Is 'apple' present? " + hashMap.containsKey("apple"));

        // Checking if a value is present
        System.out.println("Is value 15 present? " + hashMap.containsValue(15));

        // Removing a key-value pair
        hashMap.remove("orange");
        System.out.println("After removing 'orange': " + hashMap);

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        //
        System.out.println("for each BiConsumer ");
        hashMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+" : "+integer);
            }
        });

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}

