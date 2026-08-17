package Generic.GenericMethods;

public class VarArgs_GenericMethds {
    static <T> void print(T... values)
    {
        for(T value: values)
        {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        print(10,20,30);
        print(56, 78);
        print("Ganesh", "Nani");
        print(78, "Ganesh");


    }
}
