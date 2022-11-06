package PSOOP_Experiment1;

import java.util.*;      // including the class to use inbuilt functiond
public class Prime {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);   // creating the scanner object
            int start,end;
            System.out.println("Enter the starting number of the range: ");
            start = sc.nextInt();
            System.out.println("Enter the ending number of the range: ");
            end = sc.nextInt();
            Prime1 obj = new Prime1();  // making the object for the external class in main to access its methods
            obj.prime(start,end);  // calling the method from the external class

        }
    }
    class Prime1   // the external class
    {
        void prime(int x, int y)       // method to check prime
        {
            System.out.print("the prime numbers are: ");
            int count = 0;
            for(int i =x;i<=y;i++)
            {
                int flag = 0;
                if(i == 1)
                {
                    flag++;
                }
                for(int j=2;j<i;j++)
                {
                    if(i%j == 0)
                    {
                        flag++;
                    }
                }
                if(flag == 0)
                {
                    System.out.print(" "+i);

                    count++;
                }
            }
            System.out.println("\nthe number of prime numbers between "+x+" and "+y+" are: "+count);
        }

    }

