package CollectionFramework;

import java.util.TreeSet;

public class TreeSetMethodsExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(9);

        // Displaying the elements of the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // headSet method: Returns a view of the portion of the TreeSet whose elements are strictly less than the specified element
        TreeSet<Integer> headSet = (TreeSet<Integer>) treeSet.headSet(6);
        System.out.println("HeadSet (elements less than 6): " + headSet);

        // tailSet method: Returns a view of the portion of the TreeSet whose elements are greater than or equal to the specified element
        TreeSet<Integer> tailSet = (TreeSet<Integer>) treeSet.tailSet(6);
        System.out.println("TailSet (elements greater than or equal to 6): " + tailSet);

        // subSet method: Returns a view of the portion of the TreeSet whose elements range from the specified fromElement, inclusive, to the specified toElement, exclusive
        TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.subSet(3, 8);
        System.out.println("SubSet (elements between 3 and 8): " + subSet);

        // Checking first element of the TreeSet
        System.out.println("First element: " + treeSet.first());

        // Checking last element of the TreeSet
        System.out.println("Last element: " + treeSet.last());

        // Checking if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());

        // Getting the size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Removing an element from the TreeSet
        treeSet.remove(5);

        // Displaying the TreeSet after removal
        System.out.println("TreeSet after removal: " + treeSet);

        // Clearing the TreeSet
        treeSet.clear();

        // Checking if the TreeSet is empty after clearing
        System.out.println("Is TreeSet empty after clearing? " + treeSet.isEmpty());
    }
}
