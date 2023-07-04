package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {
    public static void main(String [] args){
        // Create PriorityQueue using Queue Class

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(244);
        queue.offer(948);
        queue.offer(19);
        queue.offer(181);
        queue.offer(33);

        System.out.println("Queue: "+queue);

        Integer head = queue.poll();
        System.out.println("Head of queue removed: "+head);

        System.out.println("Queue after removing the head: "+queue);

        queue.remove();
        System.out.println("Queue after using remove(): "+queue);

        Integer peek = queue.peek();
        System.out.println("Head without removing it: "+peek);

    }
}
