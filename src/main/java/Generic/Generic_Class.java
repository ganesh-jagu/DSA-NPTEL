package Generic;

public class Generic_Class<T> {
    void genericprint(T t)
    {
        System.out.println(t);
    }
    public static void main(String[] args) {
        Generic_Class<Integer> gm = new Generic_Class();
        gm.genericprint(101);
        Generic_Class<String> gm2=new Generic_Class<>();
        gm2.genericprint("ganesh");


    }
}
