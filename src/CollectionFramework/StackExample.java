package CollectionFramework;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        // Displaying elements
        System.out.println("Stack: " + stack);

        // Popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peeking: " + stack);

        // Searching for an element in the stack
        int position = stack.search("Java");
        System.out.println("Position of 'Java' in the stack: " + position);

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
