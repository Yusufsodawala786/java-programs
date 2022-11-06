package PSOOP_Experiment9;

import java.util.*;


class TestPayment{          //  main class
    public static void main(String[] args) {
        System.out.println("Welcome to SPIT Bank");
        int choice;
        Scanner sc = new Scanner(System.in);
        SavingsAccount obj = new SavingsAccount();
        obj.getData();
        for(;;)
        {
            System.out.println("Choose from the followig:\n1.Deposit\n2.Withdraw\n3.Display Balance\n4.Calculate interest");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {                 // menu for the program
                case 1:
                    System.out.print("Enter amount to deposit:");
                    int deposit = sc.nextInt();
                    obj.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withdraw = sc.nextDouble();
                    obj.withdraw(withdraw);
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.out.print("Enter number of years you want to calculate interest:");
                    int n = sc.nextInt();
                    System.out.println("The interest on your present balance will be "+obj.addInterest(n));
                    break;
                default:
                    break;
            }
            System.out.print("Enter 1 to continue with transaction or 0 to stop:");
            int innerChoice = sc.nextInt();
            if (innerChoice==0) {
                System.out.println("Thank you for banking with us!");
                break;
            }
            else{
                continue;
            }
        }
    }
}
abstract class Account{         //abstract class
    String name;
    double Balance;
    String acc_no;
    abstract void deposit(int x);
    abstract void withdraw(double z);
    abstract void display();
}
class SavingsAccount extends Account{
    double minBalance = 1000;            // initializing variables
    double interestRate=0.02;
    Scanner sc = new Scanner(System.in);
    void deposit(int x){
        Balance += x;
        System.out.println("Successfully deposited "+x+" Rs");
    }
    void withdraw(double z){
        try {                    // try catch block to catch custom made exception
            check(z);
            Balance -= z;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    void display(){
        System.out.println("You have a balance of Rs."+Balance);
    }
    void getData(){                // method to get data from the user
        System.out.print("Enter name on account:");
        name = sc.next();
        System.out.print("Enter account number:");
        acc_no = sc.next();
        System.out.print("Enter balance in account:");
        Balance = sc.nextDouble();
    }
    double addInterest(int n){
        return Balance*n*interestRate;
    }
    void check(double y) throws insufficient_amount_exception{      // method that throws the exception
        if (y>Balance||(y-Balance)<minBalance) {
            throw new insufficient_amount_exception("You do not enough money.");
        }
    }
}
class insufficient_amount_exception extends Exception{       // creation of custom exception
    insufficient_amount_exception(String s)
    {
        super(s);
    }
}