package Collections.Map;

import java.util.*;

public class HashTableEx {
    public static void main(String[] args) {
        // Hashtable
        Map<Integer, String> m=new Hashtable<>();
        m.put(533449,"Chendurthi");
        m.put(500084,"Hyderabad");
        m.put(500444,"Katipudi");
        m.put(500789,"Thatiparthi");
        System.out.println(m);

        System.out.println(m.keySet());
        System.out.println(m.values());

        Set<Integer> keys= m.keySet();
        for(Integer key: keys)
        {
            System.out.println(key);
        }

        Collection<String> values=m.values();
        for (String value:values)
        {
            System.out.println(value);
        }

        // values get using the Key get()
        System.out.println("Get: "+m.get(533449));
        System.out.println("Key ----- value");
        for(Integer key:keys)
        {
            System.out.println(key+"-----"+m.get(key));
        }

        // EntrySet -- it give the both Key and Value also
        System.out.println("EntrySet");
        Set<Map.Entry<Integer, String>> entrys=m.entrySet();
        for(Map.Entry<Integer, String> entry: entrys)
        {
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"---"+value);
        }

        // Deletion of elements
        m.remove(500084,"Hyderabad");
        System.out.println(m);
        m.remove(500444);
        System.out.println(m);

        // update
        // we can use the put() as updation or putIfAbsent() methods we can use
        m.put(500789,"Vannepudi");
        System.out.println(m);
        m.putIfAbsent(533449,"EBC colony");
        System.out.println(m);
        m.replace(500789,"Kodavali");
        System.out.println(m);
        m.putIfAbsent(533455,"Gollaprolu");
        System.out.println(m);

        // verification
        System.out.println(m.containsKey(533449));
        System.out.println(m.containsValue("Chendurthi"));
        System.out.println(m.containsKey(678878));

        // Deletion
        System.out.println("Removed Element: "+m.remove(533455));
        System.out.println(m);

        m.clear();
        System.out.println(m);

        Map<Integer,String> m2=new Hashtable<>();
        m2.put(1,"one");
       // m2.put(null,"Two"); // it dont except the null key
       // m2.put(3,null); // It dont except the null values
        System.out.println(m2);

        /*
                Hashtable
         ├── Key-value pairs
         ├── No guaranteed ordering
         ├── Does NOT allow null key
         ├── Does NOT allow null values
         └── Synchronized
         */

        // HaspMap

        HashMap<Integer,String> hm=new HashMap<>();
        System.out.println("HashMap");
        hm.put(11,"Eleven");
        hm.put(null,"Twelw");
        hm.put(13,null);
        System.out.println(hm);
        hm.put(null,"Fourteen"); // It Except only one null key if again we take the null the value is updated
        hm.put(15,null);
        System.out.println(hm);
             /*   HashMap
         ├── Key-value pairs
         ├── No guaranteed ordering
         ├── Allows one null key
         ├── Allows multiple null values
         └── Not synchronized */

        // LinkedHashMap
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        System.out.println("LinkedHashMap");
        lhm.put(21,"twentyone");
        lhm.put(23,"twentyThree");
        lhm.put(22,"twentytwo");
        lhm.put(null,"twentyFour");
        lhm.put(25,"TwentyFive");
        lhm.put(null,"TwentySix"); // It allow only one Null Key
        lhm.put(27,null); // It allows multipe null values
        System.out.println(lhm);

        /*
                LinkedHashMap
         ├── Key-value pairs
         ├── Maintains insertion order
         ├── Allows one null key
         ├── Allows multiple null values
         └── Not synchronized
         */

        // TreeMap
        Map<Integer,String> tm=new TreeMap<>();
        tm.put(31,"Thirty one");
        tm.put(33,"Thirty three");
        //tm.put(null, "Thirty Four"); // it dont exceot the null key
        tm.put(35,null);
        tm.put(39,"Thrity nine");
        tm.put(30,"Thirty");
        tm.put(37,null);
        System.out.println(tm);
        /*
                TreeMap
         ├── Key-value pairs
         ├── Sorted by key
         ├── Does NOT allow null key
         ├── Allows multiple null values
         └── Not synchronized
         */

    }
}
