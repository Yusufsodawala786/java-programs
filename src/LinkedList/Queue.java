package LinkedList;

public class Queue {

    public class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    node front;
    node rear;
    public void enqueue(int data){
        node newnode = new node(data);
        node currNode = front;
        if(front == null)
        {
            front = newnode;
        }
        else
        {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue()
    {
        if(front == null)
        {
            System.out.println("Cannot perform dequeue... list is empty");
        }
        else
        {
            node currNode = front;
            int x = currNode.data;
            front = front.next;
        }
    }
    public void peek()
    {
        System.out.println(front.data);
    }
    public void printlist()
    {
        if(front == null)
        {
            System.out.println("List is empty!");
        }
        node currNode = front;
        while(currNode != null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        Queue list = new Queue();
        list.enqueue(10);
        list.printlist();
        list.enqueue(20);
        list.printlist();
        list.enqueue(40);
        list.printlist();
        list.enqueue(30);
        list.printlist();
        list.enqueue(50);
        list.printlist();
        list.dequeue();
        list.printlist();
        list.dequeue();
        list.printlist();
        list.dequeue();
        list.printlist();
        list.dequeue();
        list.printlist();
        list.dequeue();
        list.printlist();
    }
    
}
