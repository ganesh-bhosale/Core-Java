package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque01 {
    public static void main(String [] args){
        // Create a deque
        Deque<String> deque =new ArrayDeque<>();

        // add element to the deque
        deque.add("HDFC Bank");
        deque.addFirst("ICICI Bank");
        deque.add("JP Morgan chase");
        deque.addLast("Axis Bank");
        deque.add("IDFC First Bank");
        deque.add("RBI");

        // print the deque
        System.out.println("Deque: "+deque);

        // Remove the elements from queue
        String head = deque.removeFirst();
        String tail = deque.removeLast();

        // Print the removed elements
        System.out.println("Head: "+head+ "\nTail: "+tail);

        // Print deque after removing elements
        System.out.println("Deque after removing elements: "+deque);

        // Retrieving the elements from queue
        String first = deque.getFirst();
        String last = deque.getLast();

        // Print the retrived element

        System.out.println("First and Last Elements are : "+first+", "+last);
        System.out.println("Deque Final: "+deque);
    }
}
