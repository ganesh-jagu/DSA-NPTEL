package Collections.Collection.List.Stack;

import java.util.Stack;
import java.util.Vector;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> laptop=new Stack<>();
        System.out.println(laptop.size());
        System.out.println(laptop.capacity());
        laptop.add("Dell");
        laptop.add("ThinkPad");
        laptop.add("Apple");
        System.out.println(laptop);
        laptop.add(1,"HP");
        System.out.println(laptop);
        laptop.set(2,"Lenova");
        System.out.println(laptop);
        System.out.println(laptop.contains("ThinkPad"));
        System.out.println(laptop.size());
        System.out.println(laptop.capacity());
        System.out.println(laptop);

        // Special Methods in the Stack
        laptop.push("Asis");
        System.out.println(laptop);
        // laptop.push(1,"Snapdragon"); // Index based insertion is not possible it take only element and insert in a order we dont place the element in particular index by using this Push method.
        System.out.println("Peek: "+laptop.peek()); // It return the last element in the stack and dont delete the element
        System.out.println(laptop);
        System.out.println("Pop: "+laptop.pop()); // It delete the last element and return that element
        System.out.println(laptop);
        System.out.println(laptop.contains("Asis"));


        System.out.println(laptop);
        System.out.println("Search(Dell): "+laptop.search("Apple"));
        System.out.println("Index of(Dell): "+laptop.indexOf("Dell"));

        laptop.push(null);
        laptop.push("Dell");
        laptop.push(null);
        System.out.println(laptop);
        laptop.remove("Dell");
        System.out.println(laptop);
        laptop.remove(null);
        System.out.println(laptop);

       // Vector<Integer> s3=new Stack<>(); // here we decalred the s3 as the vector but we crate the object for Stack so we perform the stack opearation what are availble in the Vector class but we can perfomr the Stack specified method oprations like "push(), pop(), peek(), shearch()
       // s3.push("pen");
       //  System.out.println(s3);





    }
}
