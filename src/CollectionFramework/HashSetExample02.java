package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public interface HashSetExample02 {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Adding duplicate element
        set.add("apple");

        // Displaying the elements of the HashSet
        System.out.println("HashSet: " + set);

        // Removing an element from the HashSet
        set.remove("banana");

        // Displaying the elements of the HashSet after removal
        System.out.println("HashSet after removal: " + set);

        // Checking if an element is present in the HashSet
        System.out.println("Is 'orange' present? " + set.contains("orange"));

        // Getting the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Checking if the HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        //copy
        Object[] s= set.toArray();
        System.out.println("copied: "+Arrays.toString(s));

        // Clearing the HashSet
        set.clear();

        // Checking if the HashSet is empty after clearing
        System.out.println("Is HashSet empty after clearing? " + set.isEmpty());
    }
}
