package Generic.GenericClass;

public class BoundedGenericClass<T extends Number> {
    T values;
    BoundedGenericClass(T values)
    {
        this.values=values;
    }
    public void display()
    {
        System.out.println(values);
    }

    public static void main(String[] args) {
        BoundedGenericClass<Integer> bgc1=new BoundedGenericClass<>(100);
        BoundedGenericClass<Double> bgc2=new BoundedGenericClass<>(25.7);
       // the String value is not acceble why because the "BoundedGenericClass<T extends Number>" it is only take the Number type of data only
        // BoundedGenericClass<String> bgc3=new BoundedGenericClass<String>("String Values");
        bgc1.display();
        bgc2.display();
      //  bgc3.display();
    }

}
