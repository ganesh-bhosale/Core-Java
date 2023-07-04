package Collections.stack;

import java.util.Stack;

public class stack01 {
    public static void main(String [] args){
        // Create an Stack Object

        Stack<String> stack = new Stack<>();

        // add elements to stack
        stack.push("Java");
        stack.push("is");
        stack.push("Awesome!");

        // Retrieve and remove elements from stack
        while(!(stack.isEmpty())){
            System.out.println(stack.pop());
        }

    }
}
