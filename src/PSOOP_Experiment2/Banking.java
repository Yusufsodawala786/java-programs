package PSOOP_Experiment2;

import java.lang.Math;      // including the class to use inbuilt functions
import java.util.*;


public class Banking {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);     // creating scanner object
            Bank obj = new Bank();                   // creating object for external class in main to access its methodds
            System.out.println("Welcome to Axis Bank");
            int option;
            for (;;)
            {
                System.out.print("1:Deposit\n2:withdrawal\n3:compound interest\n4:simple interest\n");  //menu for the user
                option = sc.nextInt();
                switch(option)       // provision to select thuer desired mode of operation
                {
                    case 1:
                        obj.deposit();          // method call
                        break;
                    case 2:
                        obj.withdraw();         // method call
                        break;
                    case 3:
                        obj.compoundinterest();  // method call
                        break;
                    case 4:
                        obj.simpleinterest();  // method call
                        break;
                    default:
                        System.out.println("please enter the appropriate option");
                        break;
                }
                System.out.print("enter 1 if you want to continue or 0 if you want to exit ");  // menu to exit the program or continue
                int option1;
                option1 = sc.nextInt();

                if(option1 == 1)
                {
                    continue;
                }
                else
                {
                    System.out.println("Bye !! Thank you");
                    break;
                }
            }
        }

    }
    class Bank{        // external class
        int initialbalance;
        double rateofinterest;

        Bank()    // constructor to set the values of the variables
        {
            initialbalance = 1000;
            rateofinterest = 3.0;
        }

        void deposit()         // method to take deposit
        {
            System.out.println("enter the amount to be deposited!!");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            initialbalance += input;
            System.out.println("Your amount has been deposited, thank you!!");
            System.out.println("Your New Balance Is: "+initialbalance);
        }

        void withdraw()      // method to withdraw
        {
            System.out.println("enter the amount to be withrawn");
            Scanner sc = new Scanner(System.in);
            int amt = sc.nextInt();
            initialbalance -= amt;
            System.out.println("your withdrew "+amt);
            System.out.println("your final balance is "+initialbalance);
        }

        void compoundinterest()       // method to find compound interest
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the value on which interest is to be compounded: ");
            int p = sc.nextInt();
            System.out.print("enter the no. of years");
            int n = sc.nextInt();
            double amount;
            double rateofinterest = 0.05;
            amount = p*(Math.pow((1+rateofinterest),n));
            double CI = amount-p;
            System.out.println("the compound interest on your deposited amount over the span of "+n+" years is "+CI);
        }

        void simpleinterest()    // method to  find simple interest
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the no. of years");
            int n = sc.nextInt();
            double SI, rateofinterest = 0.03;
            SI = initialbalance*rateofinterest*n;
            System.out.println("the simple interest on your balance amount over the span of "+n+" years is "+SI);
        }


}
