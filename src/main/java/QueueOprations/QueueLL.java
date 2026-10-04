package QueueOprations;
import LinkedList.SLinkedList;
public class QueueLL<T> {
    SLinkedList<T> front, rear;
    QueueLL()
    {
        front=new SLinkedList<T>();
        rear=front;
    }
    // Enqueue
    public void enqueue(T data)
    {
        this.rear.insertEnd(data);
    }
    //dequeue
    public T deque()
    {
        T x=null;
        if(!isEmpty())
        {
           x=this.front.deleteFront();
           return x;
        }
        else {
            System.out.println("Queue is Empty");
            return x;
        }
    }
    // isEmpty
    public boolean isEmpty()
    {
        if(front.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }
    }
    // printQueue
    public void printQueue()
    {
        if(this.front.isEmpty())
        {
            System.out.println("Queue is underflow");
        }
        else {
            this.front.display();
        }
    }

    public static void main(String[] args) {
        QueueLL<Integer> ql=new QueueLL<>();
        ql.enqueue(20);
        ql.enqueue(30);
        ql.printQueue();
        ql.deque();
        ql.deque();;
        ql.enqueue(68);
        ql.enqueue(78);
        ql.printQueue();
        System.out.println(ql.isEmpty());
    }
}
