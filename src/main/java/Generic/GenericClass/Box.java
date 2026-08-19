package Generic.GenericClass;

public class Box<T> {
    T values;
    public void setValues(T values)
    {
        this.values=values;
    }
    public T getValues()
    {
        return values;
    }

    public static void main(String[] args) {
        Box<String> st=new Box<>();
        Box<Integer> in=new Box<>();
        st.setValues("Ganesh");
        in.setValues(100);

        System.out.println(st.getValues());
        System.out.println(in.getValues());
    }
}
