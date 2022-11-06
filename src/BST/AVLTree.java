package BST;
import java.util.*;

public class AVLTree {
    class node{
        int data;
        node left;
        node right;
        int height;
        public node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }
    public int height(node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return root.height;
        }
    }
    public int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public node rightRotate(node curr_node)
    {
        node new_node = curr_node.left;
        node temp = new_node.right;
        new_node.right = curr_node;
        curr_node.left = temp;

        curr_node.height = max(height(curr_node.left),height(curr_node.right))+1;
        new_node.height = max(height(new_node.left),height(new_node.right))+1;
        return new_node;
    }
    public node leftRotate(node curr_node)
    {
        node new_node = curr_node.right;
        node temp = new_node.left;
        new_node.left = curr_node;
        curr_node.right = temp;


        curr_node.height = max(height(curr_node.left),height(curr_node.right))+1;
        new_node.height = max(height(new_node.left),height(new_node.right))+1;
        return new_node;
    }
    public int getBalance(node root)
    {
        if(root == null)
            return 0;
        int x = height(root.left)-height(root.right);
        return x;
    }
    public node insert(node root, int value)
    {
        if(root == null)
        {
            root = new node(value);
            return root;
        }
        else if(root.data>value)
        {
            root.left = insert(root.left,value);
        }
        else if(root.data<value) {
            root.right = insert(root.right,value);
        }
        else {
            return root;
        }

        root.height = 1 + max(height(root.left),height(root.right));
        int balance = getBalance(root);

        if (balance > 1 && value < root.left.data)
        {
            preorder(root);
            System.out.println();
            System.out.println("Applying LL rotation");
            return rightRotate(root);
        }
        // Right Right Case
        if (balance < -1 && value > root.right.data)
        {
            preorder(root);
            System.out.println();
            System.out.println("Applying RR rotation");
            return leftRotate(root);
        }

        return root;
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
        int balance = getBalance(root);
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+"-->"+"("+balance+") ");
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        AVLTree tree = new AVLTree();

        for(;;)
        {
            int option;
            System.out.printf("\nOPERATIONS:\n1.Insert\n2.Exit\nEnter Your Choice: ");
            option = sc.nextInt();
            if(option == 1)
            {
                System.out.print("Enter the data to be inserted: ");
                int value = sc.nextInt();
                root = tree.insert(root,value);
                tree.preorder(root);
            }
            else if(option == 2)
            {
                System.out.println("Program Ended");
                break;
            }
        }

    }
}





