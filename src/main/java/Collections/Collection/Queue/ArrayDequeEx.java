package Collections.Collection.Queue;

import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        // Addition
        ad.add("Apple");
        ad.addFirst("Grapes");
        ad.addLast("pear");
        ad.offer("Banana");
        ad.offerFirst("Mango");
        ad.offerLast("Watermaloon");
        System.out.println(ad);
        //[Mango, Grapes, Apple, pear, Banana, Watermaloon]
        // retrival
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        //Delete
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println("Pop: "+ad.pop());
        System.out.println(ad);

        System.out.println(ad.remove());
        System.out.println(ad);
        System.out.println(ad.removeFirst());
        System.out.println(ad);
        ad.addLast("Coconet");
        System.out.println(ad);
       System.out.println(ad.removeLast());
        System.out.println(ad);

    }
}
