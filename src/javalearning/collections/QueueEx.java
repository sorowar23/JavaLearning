package javalearning.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Canada");
        queue.add("USA");
        queue.add("Bangladesh");
        queue.add("Mexico");
        System.out.println("Original queue: "+queue );
        queue.remove();
        System.out.println("queue after remove: "+queue );
        String head =  queue.peek();
        System.out.println("queue after peek: "+head );
        head = queue.poll();
        System.out.println("Removed head: "+head);
        System.out.println("queue after poll: "+queue);


    }
}
