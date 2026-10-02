package LinkedList;

public class SLinkedList <T>{
    Node head;
    class Node{
        T data;
        Node Next;
        Node()
        {
            data=null;
            Next=null;
        }
        Node(T d)
        {
            data=d;
            Next=null;
        }
    }
    SLinkedList()
    {
        head=new Node();
    }
    //Insert at front
    public void insertfront(T data){
        Node newNode=new Node(data);
        newNode.Next=this.head.Next;
        this.head.Next=newNode;
    }
    // Insert at End
    public void insertEnd(T data){
        Node newNode=new Node(data);
        newNode.Next=null;
        Node temp=this.head;
        while(temp.Next != null)
        {
            temp=temp.Next;
        }
        temp.Next=newNode;
    }
    // Insertkey
    public void insertKey(T data, T key)
    {
        Node newNode=new Node(data);
        newNode.Next=null;
        Node temp=this.head;
        boolean status=false;
        while (temp != null)
        {
            if(temp.data==key)
            {
                status=true;
                break;
            }
            temp=temp.Next;
        }
        if(status)
        {
            newNode.Next=temp.Next;
            temp.Next=newNode;
        }
    }
    public void display()
    {
        Node current=head.Next;
        while(current != null)
        {
            System.out.println(current.data + " ");
            current=current.Next;
        }
    }
// Merging the two lists
public void merge(SLinkedList<T> li) {
    Node l1Node = this.head;
    Node l2Node = li.head;

    // Move to the last node of the first list
    while (l1Node.Next != null) {
        l1Node = l1Node.Next;
    }

    // Connect the last node of first list
    // to the first data node of second list
    l1Node.Next = l2Node.Next;
}
// Delete Front Element
    public T deleteFront(){
        T x=null;
        Node temp=this.head.Next;
       // Node prev=null;
        if(temp != null)
        {
            x=temp.data;
            this.head.Next=temp.Next;
            System.out.println("Element deleted");
        }
        return x;
    }
// Delete at End
    public T deleteEnd()
    {
        T x=null;
        Node temp=this.head.Next;
        Node prev=null;
        if(temp !=null)
        {
            while(temp.Next != null)
            {
                prev=temp;
                temp=temp.Next;
            }
            x= temp.data;
            prev.Next=null;
            System.out.println("Element deleted");
        }
        return x;
    }
    // Delete Key Element
    public void deleteKey(T key)
    {
        Node temp=this.head.Next;
        Node prev=null;
        while(temp !=null)
        {
            if(temp.data == key)
            {
                prev.Next=temp.Next;
                System.out.println(key+" is deleted successfully");
                break;
            }
            else {
                prev=temp;
                temp=temp.Next;
            }
        }
    }
    // revers of a list
    public void reverse()
    {
        Node current=this.head.Next;
        Node prev=null;
        Node next=null;
        while(current !=null)
        {
            next=current.Next;
            current.Next=prev;
            prev=current;
            current=next;
        }
        this.head.Next=prev;
    }
    public static void main(String[] args) {
        SLinkedList<Integer> sl=new SLinkedList<Integer>();
        SLinkedList<Integer>li=new SLinkedList<Integer>();
        sl.insertfront(10);
        sl.insertfront(20);
        sl.insertfront(30);
        sl.insertEnd(90);
        sl.insertfront(80);
        sl.insertKey(45,30);
        System.out.println("showing elements");
        sl.display();
        System.out.println("jai balayya");
        // Linked Lis 2
        li.insertfront(100);
        li.insertEnd(780);
        //li.display();
        sl.merge(li);
        System.out.println("List Merged");
        sl.display();

        // Delete element at front
        Integer res=sl.deleteFront();
        System.out.println("Deleted element is :"+res);
        sl.display();

        // Delete element at end
        Integer del=sl.deleteEnd();
        System.out.println("Deleted Element is : "+del);
        sl.display();

        // Delete key
        sl.deleteKey(20);
        sl.display();
        // reverse a list
        System.out.println("reversing a List");
        sl.reverse();
        System.out.println("Reverersed List");
        sl.display();

    }
}


