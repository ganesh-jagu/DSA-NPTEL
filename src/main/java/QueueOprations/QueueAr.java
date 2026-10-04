package QueueOprations;

public class QueueAr<T> {
    T[] data;
    int front, rear;
    int length;
    QueueAr(T[] a)
    {
        data=a;
        front=0;
        rear=-1;
        length= data.length;
    }
    // Enqueue
    public void enqueue(T a)
    {
        if(rear>=length-1)
        {
            System.out.println("Queue is Full");
        }
        else {
            rear++;
            data[rear]=a;
        }
    }
    // Dequeue
    public T dequeue()
    {
        T x=null;
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return null;
        }
        else {
            x=data[front];
            front++;
            return x;
        }
    }
    // isEmpty()
    public boolean isEmpty()
    {
        if(front>rear)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //PrintQueue
    public void printQueue()
    {
        if(!isEmpty())
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(data[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] a=new Integer[5];
        QueueAr<Integer> qa=new QueueAr<>(a);
        qa.enqueue(30);
        qa.enqueue(40);
        qa.enqueue(50);
        // qa.printQueue();
        qa.enqueue(70);
        qa.enqueue(80);
        qa.printQueue();
        qa.enqueue(90);
        //Integer r=qa.dequeue();
        System.out.println("Removed Element is:"+qa.dequeue());
        System.out.println("Removed Element is:"+qa.dequeue());

        qa.printQueue();
        qa.enqueue(100);
        qa.printQueue();

    }
}
