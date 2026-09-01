package Collections.Itration;

import java.util.*;

public class IteraterEx {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        System.out.println(al1);
        Iterator<Integer> i1=al1.iterator();
//        while (i1.hasNext())
//        {
//            System.out.println(i1.next());
//        }
        i1.next();
        i1.remove(); // Without the next() method the remove of element using this iterator object is not possible

        System.out.println(al1);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(11);
        hs.add(12);
        hs.add(13);
        System.out.println(hs);
        Iterator<Integer> i2=hs.iterator();
        while (i2.hasNext())
        {
            System.out.println(i2.next());
        }
        i2.remove();
        System.out.println(hs);

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(21,"Twenty one");
        hm.put(22,"Twenty two");
        hm.put(23,"Twenty Three");
        hm.put(24,"Twenty Four");
        System.out.println(hm);
        //Iterator<String> i3=hm.iterator();// in the Map the Iterator is not acceptable this Iterator is only acceess only at the Collection interface only not for the Map
        // Other Way of Accessing this Iterator for the Map
        Set<Integer> keys=hm.keySet();
        System.out.println("Iterator in the Map using the Set interface");
        Iterator<Integer>i3=keys.iterator();
        while (i3.hasNext())
        {
            System.out.println(i3.next());
        }

        Collection<String> values=hm.values();
        Iterator<String> i4= values.iterator();
        while (i4.hasNext())
        {
            System.out.println(i4.next());
        }

    }
}
