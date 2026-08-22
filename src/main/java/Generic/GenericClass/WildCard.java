package Generic.GenericClass;

public class WildCard<T> {
    T value;
    WildCard(T value)
    {
        this.value=value;
    }
    T getValue()
    {
        return value;
    }

    static void display(WildCard<?> wc )
    {
        System.out.println(wc.getValue());
    }
    static void clip(WildCard<? extends Number> wc )
    {
        System.out.println(wc.getValue());
    }
    static void show(WildCard<? super Integer> wc2)
    {
        System.out.println(wc2.getValue());
    }

    public static void main(String[] args) {

        WildCard<Integer> wc1=new WildCard<>(100);
        WildCard<Double> wc2=new WildCard<>(23.8);
        WildCard<String> wc3=new WildCard<>("Ganesh");
        display(wc1);
        display(wc2);
        display(wc3);
        // the method clip will take only Number realted data or it's highrarchy only not take the other data like String it is called "Upper Bounding"
        WildCard<Integer> wc4=new WildCard<>(100);
        WildCard<Double> wc5=new WildCard<>(23.8);
        clip(wc4);
        clip(wc5);

        WildCard<Integer> wc6=new WildCard<>(100);
        WildCard<Double> wc7=new WildCard<>(23.8);
        show(wc6);
        // the wc7 is not accept why because we declared show method as upper bound so it take the only integer and it's above highrarchy only like Number, Object not take the Double etc
        //show(wc7);
        WildCard<Number>wc8=new WildCard<>(45.89);
        show(wc8);
        WildCard<Object>wc9=new WildCard<>(89999);
        show(wc9);
    }
}
