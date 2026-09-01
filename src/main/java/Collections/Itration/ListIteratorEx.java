package Collections.Itration;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        ListIterator<Integer> li=al.listIterator();
        System.out.println("Forward");
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        li.add(9);
        System.out.println(al);
        System.out.println("Backward");
        while (li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        li.remove();
        System.out.println(al);
        li.add(7);
        System.out.println(al);
    }
}
