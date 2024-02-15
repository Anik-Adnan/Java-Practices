package Collections.Part01;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableIteratorExample {
    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Using Iterable and Iterator to iterate over the list
        System.out.println("Using Iterable and Iterator:");
        Iterable<String> iterableList = list; // ArrayList is Iterable
        //one iteratortraverse the list only one times
        Iterator<String> iterator = iterableList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using enhanced for loop (for-each loop) with Iterable
        System.out.println("\nUsing Enhanced for loop:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
