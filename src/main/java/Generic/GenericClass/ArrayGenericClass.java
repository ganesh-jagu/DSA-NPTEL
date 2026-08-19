package Generic.GenericClass;

public class ArrayGenericClass<T> {
    T[] values;
    ArrayGenericClass(T[] values)
    {
        this.values=values;
    }
   void display()
    {
        for(T values: values)
        {
            System.out.println(values);
        }
    }

    public static void main(String[] args) {
        Integer numbers[]={1,2,3,4,5};
        ArrayGenericClass<Integer> agc=new ArrayGenericClass<>(numbers);

        agc.display();
        String names[]= {"nani", "ganesh", "student"};
        ArrayGenericClass<String> agc2=new ArrayGenericClass<>(names);
        agc2.display();

    }
}
