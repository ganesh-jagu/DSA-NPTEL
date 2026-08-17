package Generic.GenericMethods;

public class Multiple_values {
    public static <T> void display(T v1, T v2, T v3)
    {
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

    public static void main(String[] args) {
        display(1,"ganesh",true);
        display("nani", 90, 80.7);
        display(true, 56, false);

    }
}
