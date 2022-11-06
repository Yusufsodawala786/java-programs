package DoublyLinkedList;

import java.util.*;

public class DLL {

    node head;
    class node{
        int data;
        node next;
        node previous;

        node(int data)
        {
         this.data = data;
         this.next = null;
         this.previous = null;
        }
    }
    public void push(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        node new_Node = new node(new_data);

        /* 3. Make next of new node as head and previous as
         * NULL */
        new_Node.next = head;
        new_Node.previous = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.previous = new_Node;

        /* 5. move the head to point to the new node */
        head = new_Node;
    }
    public void InsertBefore(int position, int new_data)
    {
        /*Check if the given nx_node is NULL*/
        if (len()+1<position) {
            System.out.println("The position does not exist!");
            return;
        }
        else if(position == len()+1)
        {
            append(new_data);
        }
        else if(len() == 0 || len() ==1)
        {
            push(new_data);
        }
        else {
            node temp = head;
            int i = 1;
            while (i != position) {
                temp = temp.next;
                i++;
            }
            // Allocate node, put in the data
            node new_node = new node(new_data);

            // Making prev of new node as prev of next node
            new_node.previous = temp.previous;

            // Making prev of next node as new node
            temp.previous = new_node;

            // Making next of new node as next node
            new_node.next = temp;

            // Check if new node is added as head
            if (new_node.previous != null)
                new_node.previous.next = new_node;
            else
                head = new_node;
        }
    }

        // Add a node at the end of the list
    void append(int new_data)
    {
        /* 1. allocate node
         * 2. put in the data */
        node new_node = new node(new_data);

        node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        new_node.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            new_node.previous = null;
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;

        /* 7. Make last node as previous of new node */
        new_node.previous = last;
    }
    public void deleteFirst()
    {
        // Make a temporary node to store the data of the node that is going to be deleted.
        node temp = head;
        // point head to the next node.
        head = head.next;
        // free the deleted node.
        temp.next = null;
        head.previous = null;
        temp.previous = null;
        // store data of the temp node in a variable.
        int x = temp.data;
        System.out.println("The element deleted is: "+x);
        System.out.println("");
    }

    public void deleteEnd()
    {
        // store head in a temporary node.
        node temp = head;
        // traverse temp to the last node.
        while(temp.next != null)
        {
            temp = temp.next;
        }
        // store the data in a variable.
        int x = temp.data;
        // free the node
        temp.previous.next = null;
        temp.previous = null;
        System.out.println("The element deleted is: "+x);
        System.out.println("");
    }

    public void deleteAtLocation(int position)
    {
        if(len() == position)
        {
            deleteEnd();
        }
        else if(position == 1)
        {
            deleteFirst();
        }
        else
        {
            node temp = head;
            int i = 1;
            while(i != position)
            {
                temp = temp.next;
                i++;
            }
            int x = temp.data;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            temp.previous = null;
            temp.next = null;
            System.out.println("The element deleted is: "+x);
        }
    }

    public void printlist(node node)
    {
        node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + "-->");
            last = node;
            node = node.next;
        }
        System.out.print("NULL");
        System.out.println("");
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + "-->");
            last = last.previous;
        }
        System.out.println("NULL");
        System.out.println("");
    }
    public int len()
    {
        int length = 0;
        node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        Scanner sc = new Scanner(System.in);
        for(;;)
        {

            System.out.printf("\nCHOICES:\n1)INSERT AT START\n2)INSERT AT END\n3)INSERT AT LOCATION\n4)DELETE AT START\n5)DELETE AT END\n6)DELETE AT LOCATION\n7)END\nENTER YOUR CHOICE: ");
            int option = 0;
            option = sc.nextInt();
            if(option == 1)
            {
                System.out.print("enter the value to be added: ");
                int value = sc.nextInt();
                list.push(value);
                list.printlist(list.head);
            }
            else if(option == 2)
            {
                System.out.print("enter the value to be added: ");
                int value = sc.nextInt();
                list.append(value);
                list.printlist(list.head);
            }
            else if(option == 3)
            {
                System.out.print("enter the position: ");
                int position = sc.nextInt();
                System.out.print("enter the value to be added: ");
                int value = sc.nextInt();
                list.InsertBefore(position,value);
                list.printlist(list.head);
            }
            else if(option == 4)
            {
                list.deleteFirst();
                list.printlist(list.head);
            }
            else if(option == 5)
            {
                list.deleteEnd();
                list.printlist(list.head);
            }
            else if(option == 6)
            {
                System.out.print("enter the position: ");
                int position = sc.nextInt();
                list.deleteAtLocation(position);
                list.printlist(list.head);
            }
            else if(option == 7)
            {
                System.out.println("code has terminated succesfully!");
                break;
            }

        }
    }
}
