package Collections.Collection.Set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(2);
        hs.add(5);
        hs.add(89);
       // hs.add(null); // Null elemnets are not acceptble
        hs.add(5);
        hs.add(78);
        hs.add(2);

        System.out.println(hs);

        //Remove
        System.out.println(hs.remove(78));
        System.out.println(hs);

        System.out.println(hs.remove(88));
        System.out.println(hs);

        // Check
        System.out.println(hs.contains(5));
        System.out.println(hs.contains(29));

        // Get - there is not have any method for get why because the elements are not storing based on index or key so we cant pass index why because it is internally behave like a key
        // so for the retrival we can use the iterbale interface or for loop
        for (Integer element : hs) {
            System.out.println(element);
        }

        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);

        TreeSet <Integer> ts=new TreeSet<>();
        // Other methods in the TreeSet
        System.out.println("Additional Methods");
        ts.add(2);
        ts.add(5);
        ts.add(67);
        ts.add(5);
        ts.add(5);
        ts.add(45);
        ts.add(89);
        ts.add(90);
        ts.add(23);
        ts.add(67);
        ts.add(78);
        System.out.println(ts);
        System.out.println("First Element: "+ts.first());
        System.out.println("Last Element: "+ts.last());
        System.out.println(ts);
        System.out.println("Poll First Element: "+ts.pollFirst());
        System.out.println("Poll Last Element: "+ts.pollLast());
        System.out.println(ts);
        // SubSet
        System.out.println("Subset of 20 to 80: "+ts.subSet(20,80));

        System.out.println("remove Subset Element of 45: "+ts.subSet(20,80).remove(45));
        System.out.println(ts);
        System.out.println("Adding element on Subset of 38:"+ts.subSet(20,80).add(38));
        System.out.println(ts);
        System.out.println("Adding element on Subset of 97 on 20 to 80:"+ts.subSet(20,80).add(97)); // Key out of range exception
        System.out.println(ts);

        /*
                TreeSet
         ├── Unique elements
         ├── Maintains sorted order
         ├── Does NOT allow null with natural ordering
         ├── Not synchronized
         └── Tree-based
*/
    }
}
