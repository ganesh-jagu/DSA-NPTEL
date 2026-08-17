package Generic.GenericMethods;

public class GenericMethodArrays {
    static <T> void print(T[] values)
    {
        for(T value: values)
        {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Integer[] number = {5,7,8};
        String [] names={"N1", "N2", "N3", "N3"};
        Double[] marks={98.7, 67.8};
        print(number);
        print(names);
        print(marks);
    }
}
