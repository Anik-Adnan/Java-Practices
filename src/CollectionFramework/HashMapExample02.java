package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample02 {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and List<String> values
        Map<String, List<String>> stringListHashMap = new HashMap<>();

        // Adding elements to the HashMap
        stringListHashMap.put("fruits", new ArrayList<>());
        stringListHashMap.put("colors", new ArrayList<>());

        // Adding elements to the list under "fruits"
        stringListHashMap.get("fruits").add("apple");
        stringListHashMap.get("fruits").add("banana");
        stringListHashMap.get("fruits").add("orange");

        // Adding elements to the list under "colors"
        stringListHashMap.get("colors").add("red");
        stringListHashMap.get("colors").add("green");
        stringListHashMap.get("colors").add("blue");

        // Displaying the HashMap
        System.out.println("HashMap: " + stringListHashMap);

        // Accessing elements of the list under "fruits"
        List<String> fruits = stringListHashMap.get("fruits");
        System.out.println("Fruits: " + fruits);

        // Accessing elements of the list under "colors"
        List<String> colors = stringListHashMap.get("colors");
        System.out.println("Colors: " + colors);

        // Adding more elements to the list under "colors"
        stringListHashMap.get("colors").add("yellow");
        stringListHashMap.get("colors").add("purple");

        // Displaying the updated HashMap
        System.out.println("Updated HashMap: " + stringListHashMap);
    }
}

