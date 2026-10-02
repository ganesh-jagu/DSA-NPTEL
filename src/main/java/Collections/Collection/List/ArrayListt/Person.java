package Collections.Collection.List.ArrayListt;

public class Person {
    private int id;
    private String name;
    public Person(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public void printData()
    {
        System.out.println(id+":"+name);
    }
}
