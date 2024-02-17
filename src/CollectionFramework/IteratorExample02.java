package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample02 {
    public static void main(String[] args) {
        // Creating a list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Getting an iterator for the list
        ListIterator<Integer> iterator = numbers.listIterator();

        // Forward traversal
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            int number=iterator.next();
            System.out.println(number);
            if(number==2){
                iterator.add(10);  // add element after '2' cursor possion

            }
            if(number==5){
                iterator.set(50); //5 is replaced by 50
            }

        }

        // Backward traversal using previous method
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
