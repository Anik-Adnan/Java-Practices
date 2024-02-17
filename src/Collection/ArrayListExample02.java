package Collection;

import java.util.ArrayList;

public class ArrayListExample02 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Access elements by index
        System.out.println("Element at index 0: " + numbers.get(0));

        // Modify an element
        numbers.set(1, 25);

        // Remove an element by index
        numbers.remove(2);

        // Iterate through the ArrayList
        System.out.println("All elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Check if an element exists
        if (numbers.contains(25)) {
            System.out.println("25 is in the ArrayList.");
        } else {
            System.out.println("25 is not in the ArrayList.");
        }

        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());

        // Clear the ArrayList
        numbers.clear();
        System.out.println("ArrayList cleared. Size: " + numbers.size());
    }
}
