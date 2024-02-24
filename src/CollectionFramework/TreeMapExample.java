package CollectionFramework;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // treeset take help to check a object same or not by the help of comapreable or comparator
        // treeset needs ascending or descending order data otherwise cause runtime exception
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("TreeMap: " + map);
    }
}
