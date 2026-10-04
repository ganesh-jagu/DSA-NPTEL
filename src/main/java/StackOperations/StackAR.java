package StackOperations;

public class StackAR<T> {
    T[] data;
    int legth;
    int top;
    StackAR(T[] a)
    {
        data=a;
        legth=a.length;
        top=-1;
    }
    // Push Operation
    public void push(T a)
    {
        if(top<legth-1)
        {
            top++;
            data[top]=a;
            System.out.println("Element Pushed to Stack");
        }
        else
        {
            System.out.println("Stack over flow");
        }
    }
    //Pop operation
    public T pop()
    {
        T a=null;
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            a=data[top];
            top--;
        }
        return a;
    }
    // Is Empty
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // Print Stack
    void printStack()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(data[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] a=new Integer[2];
        StackAR<Integer> st=new StackAR<Integer>(a);
        st.push(10);
        st.printStack();
        st.push(20);
        st.printStack();
        st.push(30);
        st.printStack();
        st.pop();
        st.printStack();
        st.push(30);
        st.printStack();
        System.out.println("Is Empty:" + st.isEmpty());

    }
}
