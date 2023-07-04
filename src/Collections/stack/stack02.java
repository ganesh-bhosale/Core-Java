package Collections.stack;

import java.util.Objects;
import java.util.Stack;

public class stack02 {
    public static void main(String [] args){
        // Different methods of Stack class

        Stack<String> stack = new Stack<>();

        // add elements to the stack
        stack.add("Java");
        stack.add("is");
        stack.add("Object");
        stack.add("Oriented");
        stack.add("Programming");
        stack.add("Language");

        System.out.println(stack);

        // Print the top element of stack without removing it
        System.out.println("Top Element: "+stack.peek());

        // Search for a element in stack
        System.out.println("Position of Java: "+stack.search("Java"));

        // Remove and print the elements in the stack

        while(!(stack.empty())){
            System.out.println("Element Removed: "+stack.pop());
        }





    }
}
