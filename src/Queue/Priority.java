package Queue;

import java.util.*;
class Priority
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        solve obj = new solve(size);
        for(;;)
        {
            System.out.printf("Enter: \n1 for enqueue \n2 for dequeue \n3 for display \n4 to exit \nEnter you choice: ");
            int option = sc.nextInt();
            if(option == 1 )
            {
                System.out.print("Enter the data: ");
                char data = sc.next().charAt(0);
                System.out.print("Enter the priority: ");
                int priority = sc.nextInt();
                obj.enqueue(data,priority);
                obj.insertionsort();
            }
            else if(option == 2)
            {
                obj.dequeue();
                obj.Display();
            }
            else if(option == 3)
            {
                obj.Display();
            }
            else if(option == 4)
            {
                break;
            }
        }
    }
}
class solve
{
    int size;
    int front = 0;
    int rear = -1;
    item[] arr;
    solve(int size)
    {
        this.size = size;
        arr = new item[size];
    }
    void enqueue(char data, int priority)
    {
        if(rear == size-1)
        {
            System.out.println("Queue is full!");
        }
        else
        {
            rear++;
            arr[rear] = new item();
            arr[rear].data = data;
            arr[rear].priority = priority;
        }
        System.out.println("Front: "+front+" Rear: "+rear);
    }
    void dequeue()
    {
        if(rear<front)
        {
            System.out.println("The queue is empty!");
        }
        else
        {
            front++;
        }

    }
    void Display()
    {
        for(int i = front;i<=rear;i++)
        {
            System.out.println(arr[i].data+""+arr[i].priority);
        }
        System.out.println("Front: "+front+" Rear: "+rear);
    }
    void insertionsort()
    {
        for(int i=front+1;i<=rear;i++)
        {
            char data = arr[i].data;
            int priority = arr[i].priority;
            int j=i;
            while(j>front && arr[j-1].priority>priority)
            {
                item temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j = j-1;
            }
        }
    }

}
class item
{
    public char data;
    public int priority;
}

