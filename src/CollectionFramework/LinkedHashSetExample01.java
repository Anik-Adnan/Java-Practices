package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample01 {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add("apple");
        set.add("banana");
        set.add("orange");

        // Adding duplicate element
        set.add("apple");

        // Displaying the elements of the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Removing an element from the LinkedHashSet
        set.remove("banana");

        // Displaying the elements of the LinkedHashSet after removal
        System.out.println("LinkedHashSet after removal: " + set);

        // Checking if an element is present in the LinkedHashSet
        System.out.println("Is 'orange' present? " + set.contains("orange"));

        // Getting the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Checking if the LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + set.isEmpty());

        // Clearing the LinkedHashSet
        set.clear();

        // Checking if the LinkedHashSet is empty after clearing
        System.out.println("Is LinkedHashSet empty after clearing? " + set.isEmpty());
    }
}
