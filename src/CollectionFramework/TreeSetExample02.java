package CollectionFramework;
import java.util.TreeSet;

public class TreeSetExample02 {
    public static void main(String[] args) {
        // data sort
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);

        // Displaying the elements of the TreeSet (naturally sorted)
        System.out.println("TreeSet: " + treeSet);

        // Adding a duplicate element
        treeSet.add(5);

        // Displaying the TreeSet after adding a duplicate element (no change in size)
        System.out.println("TreeSet after adding duplicate element: " + treeSet);

        //floor ,ceil
        System.out.println("Floor value  of 4 : "+treeSet.floor(4)); // 3
        System.out.println("ceiling  value of 4 : "+treeSet.ceiling(4)); // 5

        // Removing an element from the TreeSet
        treeSet.remove(3);

        // Displaying the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Checking if an element is present in the TreeSet
        System.out.println("Is '8' present? " + treeSet.contains(8));

        // Getting the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Checking if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Clearing the TreeSet
        treeSet.clear();

        // Checking if the TreeSet is empty after clearing
        System.out.println("Is TreeSet empty after clearing? " + treeSet.isEmpty());
    }
}
