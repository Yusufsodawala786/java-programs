package PSOOP_Experiment1;
import java.util.*;  // java class for all functions
public class Fibonacci {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);   // creating the scanner object
            int num;
            System.out.println("------------------------------------------------------------------------------");
            System.out.print("Please enter the index for which you want to print the Fibonacci series: ");
            num = sc.nextInt();
            Fibo obj = new Fibo();  // creating the Fibo object to call the external class in main
            obj.set(num);           // calling a method from that class
            System.out.print("The Fibonacci series for "+num+" index is as follows:");
            obj.display();       // displays the output
            System.out.println("------------------------------------------------------------------------------");
        }

    }
    class Fibo{             // the external class

        int number;
        void set(int x)
        {
            number = x;
        }    // method set
        int fibbo(int y)        // method to find the fibo series
        {
            int sum = 0;
            if(y==0||y==1)
            {
                return y;
            }
            else
            {
                sum += fibbo(y-1) + fibbo(y-2);
                return sum;
            }
        }
        void display()         // the method to diplay the output
        {
            for(int i = 0;i<number;i++)
            {
                System.out.print(" || "+fibbo(i));
            }
            System.out.println(" || ");
        }
    }

