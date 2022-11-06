package LinkedList;

import java.util.*;

public class Duplicate
{
    public class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data = data;
            node next = null;
        }
    }
    node head;
    public void addFirst(int data)
    {
        node newNode = new node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void Printlist()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        node p = head;
        while(p!= null)
        {
            System.out.print(p.data+" -> ");
            p = p.next;
        }
        System.out.println("NULL");

    }
    void insertionsort()
    {
        node p = head;
        node q = head.next;
        if(q!=null) {
            while (q!= null) {
                if (p.data > q.data) {
                    int temp = p.data;
                    p.data = q.data;
                    q.data = temp;
                    q = q.next;
                    p = p.next;
                }
                else {
                    p = p.next;
                    q = p.next;
                }
            }
        }
    }
    public void remove_dup()
    {
        node p = head;
        node q = head.next;
        while(q!=null && p!=null)
        {
            if(q.data == p.data)
            {
                int x = q.data;
                System.out.print("the removed duplicate is: ");
                System.out.println(x);
                p.next = q.next;
                q = q.next;
            }
            else
            {
                p = p.next;
                q = q.next;
            }
        }

    }

    public static void main(String args[])
    {
        Duplicate List = new Duplicate();
        Duplicate viewList = new Duplicate();
        int option;
        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.out.printf("Enter: \n1. add \n2. delete \n3. print \n4. exit \nEnter your option: ");
            option = sc.nextInt();

            if(option == 1)
            {
                System.out.print("Enter the value to be added: ");
                int value = sc.nextInt();
                List.addFirst(value);
                viewList.addFirst(value);
                System.out.println("******unsorted list******");
                List.Printlist();
                List.insertionsort();
                System.out.println("******sorted list******");
                List.Printlist();

            }
            else if(option == 2)
            {
                List.remove_dup();
                List.Printlist();
            }
            else if(option == 3)
            {
                System.out.println("The input list is as follows: ");
                viewList.Printlist();
                System.out.println("The output list is as follows: ");
                List.Printlist();

            }
            else
            {
                break;
            }
        }
    }
}