package CollectionFramework;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Java");
        vector.add("Python");
        vector.add("C++");
        vector.add("JavaScript");

        // Displaying elements
        System.out.println("Elements in the vector:");
        System.out.println(vector);

        // Getting the size of the vector
        int size = vector.size();
        System.out.println("Size of the vector: " + size);

        // Accessing elements by index
        String elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Setting an element at a specific index
        vector.set(1, "Ruby");
        System.out.println("Vector after setting element at index 1:");
        System.out.println(vector);

        // Removing an element
        vector.remove(3);
        System.out.println("Vector after removing element at index 3:");
        System.out.println(vector);

        // capacity size
        System.out.println("size: "+vector.size() +" capacity : "+vector.capacity());
        vector.add("html");
        vector.add("css");
        vector.add("Docker");
        vector.add("database");
        vector.add("sql");
        vector.add("Golang");
        vector.add("database");
        vector.insertElementAt("sql",2);
        vector.add("Golang");

        System.out.println("size: "+vector.size() +" capacity : "+vector.capacity());
        System.out.println(vector);

        // find string
        System.out.println(vector.indexOf(new String("Docker"),2));


        // Checking if an element exists
        boolean containsPython = vector.contains("Python");
        System.out.println("Does the vector contain 'Python'? " + containsPython);

        // Iterating over elements using Enumeration
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Elements in the vector using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Clearing the vector
        vector.clear();
        System.out.println("Vector after clearing all elements:");
        System.out.println(vector);
    }
}
