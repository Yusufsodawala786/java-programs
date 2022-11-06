
//
//import java.util.*;
//class testPayment
//{
//    public static void main(String[] args) {
//        Person[] obj = new Person[5];
////        System.out.println("For person 1");
////        obj[0] = new Person();
////        System.out.println("For person 2");
////        obj[1] = new Person();
////        System.out.println("For person 3");
////        obj[2] = new Person();
////        System.out.println("For person 4");
////        obj[3] = new Person();
////        System.out.println("For person 5");
////        obj[4] = new Person();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter the details for person " + (i + 1));
//            obj[i] = new Person();
//            obj[i].getData();
//        }
//        int choice = (int) (Math.random() * 4);
//        switch(choice)
//        {
//            case 0:
//                System.out.println("Person 1 has been selected!!");
//                obj[0].payment();
//                break;
//            case 1:
//                System.out.println("Person 2 has been selected!!");
//                obj[1].payment();
//                break;
//            case 2:
//                System.out.println("Person 3 has been selected!!");
//                obj[2].payment();
//                break;
//            case 3:
//                System.out.println("Person 4 has been selected!!");
//                obj[3].payment();
//                break;
//            case 4:
//                System.out.println("Person 5 has been selected!!");
//                obj[4].payment();
//                break;
//        }
//    }
//}
//class Westside
//{
//    static int Clothes = 10;
//    static int Accessories = 10;
//}
//abstract class Payment
//{
//    double Amount = 25000.00;
//    abstract void paymentDetails();
//}
//class CashPayment extends Payment
//{
//    int payment;
//    int noOfClothes,noOfAccessories;
//    void getData(int x,int y)
//    {
//        noOfClothes = x;
//        noOfAccessories = y;
//    }
//    void paymentDetails()
//    {
//        payment = (noOfClothes+noOfAccessories)*5000;
//        if((Amount-payment)>0)
//        {
//            Amount -= payment*5000;
//            Westside.Clothes -= noOfClothes;
//            Westside.Accessories -= noOfAccessories;
//        }
//        else
//        {
//            System.out.println("sorry you don't have enough balance: ");
//        }
//
//    }
//    void complementaryPayment() {
//        payment = (noOfClothes + noOfAccessories) * 5000;
//        if ((Amount - payment) > 0) {
//            Amount -= payment * 5000;
//            // Westside.Clothes -= noOfClothes;
//            // Westside.Accessories -= noOfAccessories;
//        }
//    }
//}
//class CreditCardPayment extends Payment
//{
//    int payment;
//    int noOfClothes,noOfAccessories;
//    Scanner sc = new Scanner(System.in);
//    String name,date,cardNumber;
//
//    void getData(int x,int y)
//    {
//        noOfClothes = x;
//        noOfAccessories = y;
//    }
//    void paymentDetails()
//    {
//        System.out.print("Enter the name on the card: ");
//        name = sc.next();
//        System.out.print("Enter the expiration date of the card: ");
//        date = sc.next();
//        System.out.print("Enter the credit card number: ");
//        cardNumber = sc.next();
//        payment = (noOfClothes+noOfAccessories)*5000;
//        if((Amount-payment)>0)
//        {
//            Amount -= payment*5000;
//            Westside.Clothes -= noOfClothes;
//            Westside.Accessories -= noOfAccessories;
//        }
//        else
//        {
//            System.out.println("sorry you don't have enough balance: ");
//        }
//    }
//    void complementaryPayment()
//    {
//        payment = (noOfClothes+noOfAccessories)*5000;
//        if((Amount-payment)>0)
//        {
//            Amount -= payment*5000;
//             // Westside.Clothes -= noOfClothes;
//            // Westside.Accessories -= noOfAccessories;
//        }
//    }
//}
//class Person
//{
//    CashPayment objC = new CashPayment();
//    CreditCardPayment objCC = new CreditCardPayment();
//    Scanner sc = new Scanner(System.in);
//    String person_name;
//    String P_id;
//    int choice;
//    int noOfClothes;
//    int noOfAccessories;
//    void getData()
//    {
//        System.out.print("Enter name of the Person: ");
//        person_name = sc.next();
//        System.out.print("Enter the id of the person: ");
//        P_id = sc.next();
//    }
//    void payment()
//    {
//        for(;;)
//        {
//            System.out.print("Enter the number of accessories you want to buy: ");
//            noOfAccessories = sc.nextInt();
//            System.out.print("Enter the number of clothes you want to buy: ");
//            noOfClothes = sc.nextInt();
//            if(Westside.Clothes < noOfClothes ||Westside.Accessories < noOfAccessories)
//            {
//                System.out.println("please enter a valid amount of items: ");
//            }
//            else
//            {
//                break;
//            }
//        }
//        for(;;)
//        {
//            System.out.println("please enter 1 if you'd like to pay through cash and 0 if you would ike to pay through card: ");
//            choice = sc.nextInt();
//            if(choice == 1)
//            {
//                objC.getData(noOfClothes,noOfAccessories);
//                objC.paymentDetails();
//                objCC.getData(noOfClothes,noOfAccessories);
//                objCC.complementaryPayment();
//
//            }
//            else if(choice == 0)
//            {
//                objCC.getData(noOfClothes,noOfAccessories);
//                objCC.paymentDetails();
//                objC.getData(noOfClothes,noOfAccessories);
//                objC.complementaryPayment();
//
//            }
//
//        }
//    }
//}
package PSOOP_Experiment7;
import java.util.Scanner;

class Westside {// class westside for the company stock
    static int Clothes = 10; // static for it being common for all objects
    static int Accessories = 10;
}

abstract class Payment {// abstract class payment for abstraction
    int MaxAmount = 50000;

    abstract void paymentDetails();
}

class CashPayment extends Payment {// class for cashpayment
    int Amount;
    int noOfClothes;
    int noOfAccessories;
    Scanner sc = new Scanner(System.in);

    void getData(int x, int y) {// getting number of clothes and accessories
        noOfClothes = x;
        noOfAccessories = y;
    }

    void paymentDetails() {// method to calculate the payment
        Amount = (noOfClothes + noOfAccessories) * 5000;
        if ((MaxAmount - Amount) >= 0) {
            MaxAmount -= Amount;
            Westside.Clothes -= noOfClothes;
            Westside.Accessories -= noOfAccessories;
        } else {
            System.out.println("Sorry no balance left");
        }
    }

    void complementaryPayment() {// method to decrease balance when credit card payment is done
        Amount = (noOfClothes + noOfAccessories) * 5000;
        if ((MaxAmount - Amount) >= 0) {
            MaxAmount -= Amount;
        }
    }
}

class CreditCardPayment extends Payment {// similar to class cashpayment
    int Amount;
    String nameOnCard;
    int CCnumber;
    String ExpirationNumber;
    int noOfClothes;
    int noOfAccessories;
    Scanner sc = new Scanner(System.in);

    void getData(int x, int y) {
        noOfClothes = x;
        noOfAccessories = y;
    }

    void paymentDetails() {
        Amount = (noOfClothes + noOfAccessories) * 5000;
        System.out.print("Enter credit card number:");
        CCnumber = sc.nextInt();
        System.out.print("Enter name on card");
        nameOnCard = sc.next();
        System.out.print("Enter expiration date of card");
        ExpirationNumber = sc.next();
        if ((MaxAmount - Amount) > 0) {
            MaxAmount -= Amount;
            Westside.Clothes -= noOfClothes;
            Westside.Accessories -= noOfAccessories;
        } else {
            System.out.println("Sorry no balance left");
        }
    }

    void complementaryPayment() {
        Amount = (noOfClothes + noOfAccessories) * 5000;
        if ((MaxAmount - Amount) >= 0) {
            MaxAmount -= Amount;
        }
    }
}

class Person {// class person for each person at the sale
    String Name;
    String ID;
    int Choice;
    int noOfClothes;
    int noOfAccessories;
    Scanner sc = new Scanner(System.in);

    void getData() {// details of the person
        System.out.print("Enter name of person:");
        Name = sc.next();
        System.out.print("Enter id of person:");
        ID = sc.next();
    }

    CashPayment objCash = new CashPayment();
    CreditCardPayment objCC = new CreditCardPayment();

    void payment() {// method for payment
        for (;;) {
            System.out.print("Enter number of clothes that you want:");
            noOfClothes = sc.nextInt();
            System.out.print("Enter number of accessories that you want:");
            noOfAccessories = sc.nextInt();
            if (noOfClothes > Westside.Clothes || noOfAccessories > Westside.Accessories) {
                System.out.println("Please enter valid amount of items!");
            } else {
                break;
            }
        }
        System.out.print("Please enter 0 for Cash and 1 for Credit Card:");
        Choice = sc.nextInt();
        if (Choice == 0) {
            objCash.getData(noOfClothes, noOfAccessories);
            objCash.paymentDetails();
            objCC.getData(noOfClothes, noOfAccessories);
            objCC.complementaryPayment();
        } else {
            objCC.getData(noOfClothes, noOfAccessories);
            objCC.paymentDetails();
            objCash.getData(noOfClothes, noOfAccessories);
            objCash.complementaryPayment();
        }
    }

    int getBalance() {// method for getting max balance in superclass
        return objCC.MaxAmount;
    }
}

class testpayment {// main class for trying
    public static void main(String[] args) {
        Person obj[] = new Person[5];// creating array of objects for 5 persons
        System.out.println("For person 1");
        obj[0] = new Person();
        obj[0].getData();// taking data
        System.out.println("For person 2");
        obj[1] = new Person();
        obj[1].getData();
        System.out.println("For person 3");
        obj[2] = new Person();
        obj[2].getData();
        System.out.println("For person 4");
        obj[3] = new Person();
        obj[3].getData();
        System.out.println("For person 5");
        obj[4] = new Person();
        obj[4].getData();
        for (;;) {
            System.out.println("Welcome to Westside!!");
            int temp = (int) (Math.random() * 4);// selecting person at random
            System.out.println("Person " + (temp + 1) + " has been selected!!");
            System.out.println("Available options for buying are: \n" + Westside.Clothes + " clothes\n"
                    + Westside.Accessories + " accessories.");
            obj[temp].payment();
            System.out.println(
                    "Thank you for shopping with us!The available balance for you is " + obj[temp].getBalance());
            if (Westside.Clothes == 0 && Westside.Accessories == 0) {
                System.out.println("Thank you for joining us today. The stock is over!!");
                break;
            }

        }
    }
}