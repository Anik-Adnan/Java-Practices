package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Create an iterator for the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Iterate over the elements of the ArrayList using the iterator
        System.out.println("Original list:");
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);

            //break in cursor position 10
            if(number==10){
                break;
            }

//            // Remove the element if it's greater than 15
//            if (number > 15) {
//                iterator.remove();
//            }
        }



        // Print the modified list after removing elements
//        System.out.println("\nList after removing elements greater than 15:");
//        for (Integer num : numbers) {
//            System.out.println(num);
//        }

        System.out.println("after 10 remaining interger: ");
//        iterator.forEachRemaining(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

        iterator.forEachRemaining(System.out::println); //same as before ,but in a one line code
    }
}
