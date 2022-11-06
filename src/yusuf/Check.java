package yusuf;
import PSOOP_Experiment10.Reverse_String;  // importing the class from another package
import java.util.*;
class Check     // main class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  // scanner object
        String str;   // variable declaration
        System.out.println("Enter the String to be reversed!!");
        str = sc.nextLine();  // user input
        System.out.println("Reversal under process....");
        System.out.println("The reversed String is: ");
        Reverse_String obj = new Reverse_String();  // object creation
        obj.reverseit(str); // method call
    }
}
