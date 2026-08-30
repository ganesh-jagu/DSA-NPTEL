package Collections.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("Redmi");
        ll1.add("Realmi");
        ll1.add("samsung");
        System.out.println(ll1);

        ArrayList<String> ar1=new ArrayList<>();
        ar1.add("Dell");
        ar1.add("Lenovo");
        System.out.println(ar1);
        ll1.addAll(2,ar1);
        System.out.println(ll1);

        ll1.set(3,"ThinkPad");
        System.out.println(ll1);

//        ll1.remove(3);
//        System.out.println(ll1);
//        ll1.remove();
//        System.out.println(ll1);
        ll1.removeAll(ar1);
        System.out.println(ll1);
        System.out.println(ar1);

        System.out.println(ll1.contains("Dell"));
        System.out.println(ll1.containsAll(ar1));
        ll1.clear();
        System.out.println(ll1);

        Collections.synchronizedList(ll1);
        System.out.println(ll1);



    }
}
