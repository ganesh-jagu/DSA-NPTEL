package StackOperations;

import LinkedList.SLinkedList;

public class StackLi<T> {
    SLinkedList<T> top;
    int l;
    StackLi()
    {
        top=new SLinkedList<T>();
        l=0;
    }

    // Push opration
    void push(T data)
    {
        l+=1;
        this.top.insertfront(data);
    }
    //pop
    T pop()
    {
        T data=null;
        if(!isEmpty())
        {
        l-=1;
        data=this.top.deleteFront();
        }
        else {
            System.out.println("Stack UnderFlow");
        }
        return data;
    }
    // check Empty or not
    boolean isEmpty()
    {
        if(this.top==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //priting the data
    public void printList()
    {
        if(this.top==null)
        {
            System.out.println("Stack is Empty");
        }
        else {
            this.top.display();
        }
    }

    public static void main(String[] args) {
        StackLi<Integer> sl=new StackLi<>();
        sl.push(100);
        sl.push(200);
       // sl.printList();
        sl.push(300);
        sl.push(400);
        sl.printList();
        sl.pop();
        sl.printList();
        sl.pop();
        sl.pop();
        sl.pop();
        sl.push(700);
        sl.printList();
        System.out.println("Is Empty: "+sl.isEmpty());
    }
}

