package BST;
import java.util.*;
public class BST {
    public class node{
        int data;
        node left;
        node right;

        node(int data)
        {
            this.data = data;
        }
    }
    public node insert(node root, int value)
    {
        if(root == null)
        {
            root = new node(value);
            return root;
        }

        if(root.data>value)
        {
            root.left = insert(root.left,value);
        }
        else {
            root.right = insert(root.right,value);
        }
        return root;
    }

    public boolean search(node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data > key)
        {
            return search(root.left,key);
        }
        else if(root.data < key)
        {
            return search(root.right,key);
        }
        else
        {
            return true;
        }

    }

    public node delete(node root,int value)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data<value)
        {
            root.right = delete(root.right,value);
        }
        else if(root.data>value)
        {
            root.left = delete(root.left,value);
        }
        else {
            if(root.left == null && root.right == null) // for leaf node
            {
                return null;
            }
            else if(root.left == null)  // if only right child is present
            {
                return root.right;
            }
            else if(root.right == null)  // if only left root is present
            {
                return root.left;
            }
            node IS = inorderSuccessor(root.right);  // if both children are present
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        return root;
    }

    public void rootToLeaf(node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        rootToLeaf(root.left);
        rootToLeaf(root.right);

    }
    public void printInRange(node root, int x, int y)
    {
        if(root == null)
        {
            return;
        }
        if(root.data>=x && root.data<=y)
        {
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if(root.data<=x)
        {
            printInRange(root.right,x,y);
        }
        else
        {
            printInRange(root.left,x,y);
        }
    }
    public node inorderSuccessor(node root) {
        while (root.left != null) {
            root = root.left;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        node root = null;
        BST tree = new BST();
        for(;;)
        {
            int option = 0;
            System.out.printf("The following are the Operations you can perform on the tree:\n1)INSERT\n2)DELETE\n3)INORDER SEQUENCE\n4)POSTORDER TRAVERSAL\n5)EXIT\nMake your choice: ");
            option = sc.nextInt();
            if(option == 1)
            {
                System.out.print("Enter the data to be inserted: ");
                int value = sc.nextInt();
                root = tree.insert(root,value);
                System.out.print("The preorder traversal gives the following resul1t: ");
                tree.preorder(root);
                System.out.println();

            }
            else if(option == 2)
            {
                System.out.print("Enter the node to be deleted: ");
                int value = sc.nextInt();
                if(tree.search(root,value))
                {
                    tree.delete(root,value);
                    System.out.print("The preorder traversal gives the following result: ");
                    tree.preorder(root);
                    System.out.println();
                }
                else
                {
                    System.out.println("------------------------");
                    System.out.println("The node is not present!");
                    System.out.println("------------------------");
                }

            }
            else if(option == 3)
            {
                System.out.print("The inorder traversal gives the following result: ");
                tree.inorder(root);
                System.out.println();
            }
            else if(option == 4)
            {
                System.out.print("The postorder traversal gives the following result: ");
                tree.postorder(root);
                System.out.println();
            }
            else if(option == 5)
            {
                break;
            }

        }

    }
}