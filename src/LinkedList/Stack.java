package LinkedList;

public class Stack {

    class node
    {
        String data;
        node next;
        node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }
    node Top;
    int size;

    public void push(String data)
    {
        node NewNode = new node(data);
        if(Top == null) {
            Top = NewNode;
            return;
        }
        NewNode.next = Top;
        Top = NewNode;


    }
    public void pop()
    {
        if(Top == null)
        {
            System.out.println("The stack is empty!");
            return;
        }
        node p = Top;
        Top = Top.next;
        String x = p.data;
        System.out.println(x);
    }
    public void peek()
    {
        if(Top == null)
        {
            System.out.println("Stack is empty!");
        }
        else{
        System.out.println(Top.data);
        }
    }

    public void Display()
    {
        if(Top == null)
        {
            System.out.println("Stack is empty!");
        }
        node currNode = Top;
        while(currNode != null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[])
    {
        Stack st = new Stack();
        st.push("YUSUF");
        st.Display();
        st.push("IS");
        st.Display();
        st.push("NAME");
        st.Display();
        st.push("MY");
        st.Display();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();

    }

}
