package Collections.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // Addtion
        pq.add(5);
        pq.add(9);
        pq.add(2);
        pq.offer(3);
        pq.offer(9);
        pq.add(10);
        pq.offer(7);
        pq.offer(1);

        // Retrival
        System.out.println(pq);
        System.out.println("Peek Element: "+pq.peek());
        System.out.println(pq);

        PriorityQueue<Integer> pq2=new PriorityQueue<>(); // Empty Queue
        System.out.println(pq2);
        System.out.println("Peek of Empty Queue: "+pq2.peek());

        // Deletion
        System.out.println(pq);
        System.out.println(pq.poll()); // poll remove the head element and return the deleted element
        System.out.println(pq);
        System.out.println(pq.remove(10));
        System.out.println(pq);

        System.out.println(pq2.poll()); // when the queue is null poll return the null
       // System.out.println(pq2.remove()); // when the queue is null remove() through the exception
        System.out.println(pq.contains(3));

        for(Integer value:pq)
        {
            System.out.println(value); // this ForEach is given in the how the queue stored not in the sorted order
        }
        System.out.println("Sorted order");
        while (!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }

        // initially the priority is less value high priority

        // changing of priority using the "Comparator.reverseOrder()"
        PriorityQueue<Integer> pq3=new PriorityQueue<>(Comparator.reverseOrder());
        pq3.add(4);
        pq3.add(5);
        pq3.add(2);
        pq3.add(8);
        System.out.println(pq3);
        while (!pq3.isEmpty())
        {
            System.out.println(pq3.poll());
        }

    }
}
