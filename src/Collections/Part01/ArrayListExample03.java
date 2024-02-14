import java.util.ArrayList;
import java.util.Collections;
//add package name
public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Accessing elements by index
        System.out.println("Element at index 2: " + fruits.get(2));

        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // Finding index of an element
        System.out.println("Index of 'Orange': " + fruits.indexOf("Orange"));

        // Checking if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Removing an element
        fruits.remove("Mango");
        System.out.println("ArrayList after removing 'Mango': " + fruits);

        // Removing an element by index
        fruits.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + fruits);

        // Reversing the ArrayList
        Collections.reverse(fruits);
        System.out.println("Reversed ArrayList: " + fruits);

        // Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("Cleared ArrayList: " + fruits);
    }
}
