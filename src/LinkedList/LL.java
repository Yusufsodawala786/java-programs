package LinkedList;
import java.util.*;
public class LL {
    class Node {
        String Data;
        Node Next;

        Node(String Data) {
            this.Data = Data;
            this.Next = null;
        }
    }
    Node head;
    public void addFirst(String Data)
    {
        Node newNode = new Node(Data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.Next = head;
        head = newNode;
    }

    public void addLast(String Data)
    {
        Node newNode = new Node(Data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.Next != null)
        {
            currNode = currNode.Next;
        }
        currNode.Next = newNode;
        newNode.Next = null;
    }

    public void addBetween(String Data)
    {
            Scanner sc = new Scanner(System.in);
            Node newNode = new Node(Data);
            System.out.println("Enter the position for the data to be stored: ");
            int k = sc.nextInt();
            Node currNode = head;
            for(int i = 1;i<k;i++)
            {
                currNode = currNode.Next;
            }
            newNode.Next = currNode.Next;
            currNode.Next = newNode;
    }
    public void deletefirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node p = head;
        String x = p.Data;
        head = head.Next;
        System.out.println(x);
    }
    public void deletelast()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node q = null;
        Node p = head;
        while(p.Next != null)
        {
            q = p;
            p = p.Next;
        }
        String x = p.Data;
        q.Next = null;
        System.out.println(x);
    }

    public void deletebetween()
    {
        Node currNode = head;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position to be deleted: ");
        int k = sc.nextInt();
        for(int i = 1;i<k;i++)
        {
            currNode = currNode.Next;
        }
        Node p = currNode.Next;
        String x = p.Data;
        currNode.Next = p.Next;
        System.out.println(x);


    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is empty!");
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.Data+" -> ");
            currNode = currNode.Next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        LL list = new LL();
        list.addLast("Yusuf");
//        list.printList();
        list.addFirst("Is");
//        list.printList();
        list.addFirst("Name");
//        list.printList();
        list.addFirst("My");
        list.printList();
        list.addBetween("The");
        list.printList();
        list.deletefirst();
        list.printList();
        list.deletelast();
        list.printList();
        list.deletebetween();
        list.printList();
    }
}
