package Collections.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        System.out.println(al1.size());
        al1.add(1);
        System.out.println(al1);
        System.out.println(al1.size());

        ArrayList<Integer> al2=new ArrayList<>(12);
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(1);
//        al2.add(2);
//        al2.add(3)

        System.out.println      (al2.size());
        al2.add(4);
        System.out.println(al2);
  //      al2.add(12, 50);
        System.out.println(al2);
        Collections.synchronizedList(al2);
        System.out.println(al2);
    }

}
