package stack;
import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your stack!");
        int n = sc.nextInt();
        char arr[] = new char[n];
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" character of the stack");
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("The reversed Stack is as follows: ");
        for(int i = n-1;i>=0;i--)
        {
            System.out.println("The "+(i+1)+" element is: "+arr[i]);
        }
    }
}
