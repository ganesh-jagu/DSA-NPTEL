package Generic.GenericMethods;

import com.sun.security.jgss.GSSUtil;

public class Method_return {
    public static <T> T return_method(T values)
    {
        return values;
    }

    public static void main(String[] args) {
        Integer a=return_method(100);
        String b=return_method("Ganesh");
        Boolean c=return_method(true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
