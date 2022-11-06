package PSOOP_Experiment7;

import java.util.*;

abstract class Marks
{
    abstract double getPercentage();
}
class A extends Marks
{
    int M1,M2,M3;
    A(int x,int y,int z)
    {
        M1 = x;
        M2 = y;
        M3 = z;
    }
    double getPercentage()
    {
        double percentage = (double)((M1+M2+M3))/3;
        return percentage;
    }
}
class B extends Marks
{
    int M1,M2,M3,M4;
    B(int w,int x,int y,int z)
    {
        M1 = w;
        M2 = x;
        M3 = y;
        M4 = z;
    }
    double getPercentage()
    {
        double percentage = (double)((M1+M2+M3+M4))/4;
        return percentage;
    }
}
class Percentage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sub1B,sub2B,sub3B,sub4B,sub1A,sub2A,sub3A;
        System.out.println("Enter the marks of student A: ");
        System.out.print("Enter the marks in the first subject: ");
        sub1A = sc.nextInt();
        System.out.print("Enter the marks in the second subject: ");
        sub2A = sc.nextInt();
        System.out.print("Enter the marks in the third subject: ");
        sub3A = sc.nextInt();
        System.out.println("Enter the marks of student B: ");
        System.out.print("Enter the marks in the first subject: ");
        sub1B = sc.nextInt();
        System.out.print("Enter the marks in the second subject: ");
        sub2B = sc.nextInt();
        System.out.print("Enter the marks in the third subject: ");
        sub3B = sc.nextInt();
        System.out.print("Enter the marks in the fourth subject: ");
        sub4B = sc.nextInt();

        A obj1 = new A(sub1A,sub2A,sub3A);
        System.out.printf("The percentage of student A is: %.2f\n",obj1.getPercentage());
        B obj2 = new B(sub1B,sub2B,sub3B,sub4B);
        System.out.printf("The percentage of student B is: %.2f\n",obj2.getPercentage());

    }
}
