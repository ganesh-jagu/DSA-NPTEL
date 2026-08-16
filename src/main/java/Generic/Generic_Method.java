package Generic;

import java.sql.SQLOutput;

public class Generic_Method {
    public static <T> void genericMethod(T t)
    {
        System.out.println(t);
    }

    public static void main(String[] args) {
       genericMethod(100);
       genericMethod("Ganesh");
       genericMethod(25.5);
       genericMethod(true);
    }
}
