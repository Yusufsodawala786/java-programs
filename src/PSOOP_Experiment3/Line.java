package PSOOP_Experiment3;

import java.util.*;     // including the class to use inbuilt functions

class Line
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);   // creating scanner object
        System.out.println("please select the form of line you would like to have the equation of: \n1. slope-intercept form \n2. slope-point form \n3. two-point form");  // menu for user
        int option = sc.nextInt();
        if(option == 1)   // option to select operation
        {
            System.out.print("Please enter the slope of the equation: ");
            int slope = sc.nextInt();
            System.out.print("Please enter the y intercept of the equation: ");
            int intercept = sc.nextInt();
            Line1 obj1 = new Line1(slope,intercept);     // creating object for external class in main to access its methods
        }
        else if(option == 2)
        {
            System.out.print("Please enter the slope of the equation: ");
            int slope = sc.nextInt();
            System.out.print("Please enter the x co-ordinate of the equation: ");
            int x = sc.nextInt();
            System.out.print("Please enter the y co-ordinate of the equation: ");
            int y = sc.nextInt();
            Line1 obj2 = new Line1(slope,x,y);      // creating object for external class in main to access its methods
        }
        else if(option == 3)
        {

            System.out.print("Please enter the x1 co-ordinate of the equation: ");
            int x1 = sc.nextInt();
            System.out.print("Please enter the y1 co-ordinate of the equation: ");
            int y1 = sc.nextInt();
            System.out.print("Please enter the x2 co-ordinate of the equation: ");
            int x2 = sc.nextInt();
            System.out.print("Please enter the y2 co-ordinate of the equation: ");
            int y2 = sc.nextInt();
            Line1 obj3 = new Line1(x1,x2,y1,y2);     // creating object for external class in main to access its methods
        }
        else
        {
            System.out.println("please enter a valid option!!");
        }
    }
}

class Line1     // external class
{
    Line1(int m, int c)   // use of constructor overloading
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("y = "+m+"x + "+c);
        System.out.print("Enter x coordinate:");
        int x = sc.nextInt();
        double y = (m*x+c);
        System.out.printf("The y coordinate will be = %.2f .",y);
    }
    Line1(int m, int x1, int y1)     // parameterized constructor
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("(y-"+y1+") = "+m+"(x-"+x1+")");
        System.out.print("Enter x coordinate:");
        int x = sc.nextInt();
        double y = (y1 + m*(x-x1));
        System.out.printf("The y coordinate will be = %.2f .",y);
    }
    Line1(int x1, int x2, int y1, int y2)
    {
        Scanner sc = new Scanner(System.in);
        double m = (double)(y2-y1)/(x2-x1);
        int y = y2-y1;
        int x = x2-x1;
        System.out.printf("The equation of the line is (y - %d)/%d = %.2f (x - %d)/%d \n",y1,y,m,x1,x);
        System.out.print("Enter x coordinate:");
        int X = sc.nextInt();
        double Y = (double)(y1+(y)*m*(X-x1)/(x));
        System.out.printf("The y coordinate will be = %.2f .",Y);

    }

}