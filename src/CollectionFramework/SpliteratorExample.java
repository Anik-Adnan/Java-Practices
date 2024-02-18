package CollectionFramework;

import java.util.Spliterator;
import java.util.Stack;

public class SpliteratorExample {
    public static void main(String[] args) {
        // spliterator works fine for stack,vector,arraylist in a same way  but not in linkist
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        Spliterator<String> spliterator = stack.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        System.out.println("spliterator :");
        spliterator.forEachRemaining(System.out::println); // last half
        System.out.println("spliterator1 :");
        spliterator1.forEachRemaining(System.out::println); //first half
    }
}
