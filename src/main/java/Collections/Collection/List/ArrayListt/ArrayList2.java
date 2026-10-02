package Collections.Collection.List.ArrayListt;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> ar1=new ArrayList<>();
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(4);
        System.out.println(ar1);

        ArrayList<Integer> ar2=new ArrayList<>(ar1);
        ar2.add(10);
        ar2.add(11);
        ar2.add(12);
        System.out.println(ar2);
    }
}
