package Collections.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(2);
        hs.add(5);
        hs.add(89);
        hs.add(null);
        hs.add(5);
        hs.add(78);
        hs.add(2);
        hs.add(null); // Allows only one null
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

                /*
                LinkedHashSet
         ├── Unique elements
         ├── Maintains insertion order
         ├── Allows one null element
         ├── Not synchronized
         └── Hash table + linked structure
         */
    }
}
