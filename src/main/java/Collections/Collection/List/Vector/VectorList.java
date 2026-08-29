package Collections.Collection.List.Vector;


import java.util.Arrays;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("Ganesh");
        v1.add(3);
        v1.add(23.5);
        v1.add("hi");
        v1.add("Ganesh");
        v1.add(3);
        v1.add(23.5);
        v1.add("hi");
        v1.add("Ganesh");
        v1.add(3);
        v1.add(5,"jai");

        System.out.println(v1);
        System.out.println("Size:"+v1.size());
        System.out.println("Capacity:"+v1.capacity());

        Vector v2=new Vector();
        v2.add(34);
        v2.add("Nani");
        System.out.println();
        v1.addAll(4,v2);
        System.out.println(v1);
        System.out.println(v2);

        System.out.println(v1.get(5));
        System.out.println(v1.get(7));

        v1.remove(2);
        System.out.println(v1);
        v2.clear();
        System.out.println(v2);

        Vector v3=new Vector();
        v3.add("Ganesh");
        v3.add("Nani");
        v3.add(34);

        System.out.println(v1.contains(v2));
        System.out.println(v1.contains("Ganesh"));
        System.out.println(v1.contains(23.5));
        System.out.println(v1);
        System.out.println(v3);
        System.out.println(v1.containsAll(v3));

        System.out.println(v1);
        v1.set(2, "hello");
        System.out.println(v1);
        System.out.println( v1.indexOf("Nani"));
        Object[] arr=new Object[]{4,5,6,7};
        Vector v5=new Vector(Arrays.asList(arr));
        System.out.println(v5);

//        DrawBack
//        Vector v6=new Vector();
//        v6.add(20);
//        v6.add("night");
//        v6.add(78.9);
//        int sum=0;
//        for(int i=0;i<=v6.size();i++)
//        {
//            sum += (Integer)v6.get(i);
//            System.out.println(sum);
//        }

    }
}
