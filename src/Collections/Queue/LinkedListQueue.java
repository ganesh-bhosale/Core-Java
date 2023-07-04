package Collections.Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedListQueue {
    public static void main(String [] args){
        // Create new LinkedList queue
        Queue<String > queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Ford");
        queue.offer("Mustang");
        queue.offer("Toyota");
        queue.offer("Volvo");
        queue.offer("Tata");

        // Print the queue

        System.out.println("Queue: "+queue);

        // Remove the head/first element of queue and print it
        String head = queue.poll();
        System.out.println("Removed head from the queue: "+head);

        // print the queue after removing the head
        System.out.println("Queue after removing the head: "+queue);

        // Retrive the head of the queue after removing it
        String peek = queue.peek();
        System.out.println("Head of the queue without removing it: "+peek);

    }
}

