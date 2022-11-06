package BST;
import java.util.*;
public class ExpressionTree
{
    class node
    {
        char data;
        node left;
        node right;

        node(char data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean isOperator(char ch)
    {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
        {
            return true;
        }
        return false;
    }

    public void inorder(node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public void preorder(node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public node CreateTree(String postfix)
    {
        int len = postfix.length();
        StackX stack = new StackX(len);
        node t1,t2,temp;
        int operator  = 0;
        int operand = 0;

        for(int i =0;i<len;i++)
        {
            if(!isOperator(postfix.charAt(i)))
            {
                operand++;
            }
            else{
                operator++;
            }
        }
        if(operand != operator+1)
        {
            System.out.println("expression is not postfix!");
            System.exit(0);
        }

        for(int i=0;i<len;i++){
            if(!isOperator(postfix.charAt(i))){
                temp = new node(postfix.charAt(i));
                stack.push(temp);
            }
            else{

                temp = new node(postfix.charAt(i));
                t1 = stack.pop();
                t2 = stack.pop();

                temp.left = t2;
                temp.right = t1;

                stack.push(temp);



            }

        }
        temp = stack.pop();
        return temp;

    }


    public static void main(String args[])
    {
        ExpressionTree tree = new ExpressionTree();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the postfix expression of the tree you want to create: ");
        String postfix = sc.nextLine();
        node root = tree.CreateTree(postfix);
        System.out.print("The inorder Traversal of the given Expression Tree is: ");
        System.out.print("(");
        tree.inorder(root);
        System.out.print(")");
        System.out.println();
        System.out.print("The preorder Traversal of the given Expression Tree is: ");
        System.out.print("(");
        tree.preorder(root);
        System.out.print(")");
        System.out.println();
        System.out.print("The postorder Traversal of the given Expression Tree is: ");
        System.out.print("(");
        tree.postorder(root);
        System.out.print(")");
        System.out.println();
    }

    class StackX {
        node stack[];
        int top;
        int maxsize;
        int count = 0;

        public StackX(int y) {
            maxsize = y;
            stack = new node[maxsize];
            top = -1;
        }

        public void push(node x) {
            stack[++top] = x;
            count++;
        }

        public node pop() {
            count--;
            return stack[top--];
        }

        //    public char peek()
//    {
//        return stack[top];
//    }
        public boolean isEmpty() {
            return (top == -1);
        }

        //    public boolean isFull()
//    {
//        return (top == maxsize-1);
//    }
        public int precedence(node c) {
            if (c.data == '+' || c.data == '-') {
                return 1;
            } else
                return 2;
        }
    }
}

