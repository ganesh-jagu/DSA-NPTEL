package Generic.GenericMethods;

public class ObjectValues {
    static void print(Object [] values)
    {
        for(Object value:values)
        {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Object [] values={"Ganesh", 25, 56.9};
        print(values);
    }
}
