package Collections.Collection.List.ArrayListt;

import java.util.ArrayList;

public class PArrayList {
    public static void main(String[] args) {
        ArrayList<Person> plist=new ArrayList<Person>();
        plist.add(new Person(101,"Ganesh"));
        Person p1=new Person(102,"User2");
        plist.add(p1);
        plist.add(new Person(103,"user3"));

        for(Person p:plist)
        {
            p.printData();
        }
    }
}
