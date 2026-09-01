package Collections.Itration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class EnumerationEx {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        System.out.println(v1);
        // Accessing of Elements usig the Legacy Interface Enumeration
        // It is used for legacy classes: Vector, Stack, HashTable, Dictionary, Poperties

        Enumeration<Integer> e=v1.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

        Stack<Integer> s=new Stack<>();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        System.out.println(s);
        Enumeration<Integer> e2=s.elements();
        while (e2.hasMoreElements())
        {
            System.out.println(e2.nextElement());
        }

        // Hashtable
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(21,"twentyone");
        ht.put(22,"Thwenty Two");
        ht.put(23,"Twenty Three");
        System.out.println(ht);
        Enumeration<String> e3=ht.elements();
        while (e3.hasMoreElements())
        {
            System.out.println(e3.nextElement());
        }
    }
}
