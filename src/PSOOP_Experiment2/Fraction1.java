package PSOOP_Experiment2;
import java.util.*;        // import class to use inbuilt functions

class Fraction1        // main class
{
    public static void main(String args[])
    {
        fraction obj = new fraction();    // creating object for external class to access its methods
        Scanner sc = new Scanner(System.in); // creating the scanner object
        System.out.print("Enter numerator of the first fraction: ");
        int num1 = sc.nextInt();
        System.out.print("Enter denominator of the first fraction: ");
        int den1 = sc.nextInt();
        System.out.print("Enter numerator of the second fraction: ");
        int num2 = sc.nextInt();
        System.out.print("Enter denominator of the second fraction: ");
        int den2 = sc.nextInt();
        obj.add(num1,den1,num2,den2);    // calling the methods from the external class
        obj.sub(num1,den1,num2,den2);
        obj.mul(num1,den1,num2,den2);
        obj.div(num1,den1,num2,den2);
    }


}

class fraction    // external class
{
    int a,b,c,d;

    fraction()     // constructor to set the values of the variable
    {
        a = 1;
        b = 1;
        c = 1;
        d = 1;
    }
    void add(int w,int x,int y, int z)  // method to add two fractions
    {
        a = w;
        b = x;
        c = y;
        d = z;
        int addnum,addden;
        addnum = a*d + b*c;
        addden = b*d;
        System.out.print("Addition of the fractions "+a+"/"+b+" and "+c+"/"+d+" is equal to: ");
        reduce(addnum,addden);    // method call to reduce the fraction
    }
    void sub(int w,int x,int y, int z)   // method to subtract two fractions
    {
        a = w;
        b = x;
        c = y;
        d = z;
        int subnum,subden;
        subnum = a*d - b*c;
        subden = b*d;
        System.out.print("Subtraction of the fractions "+a+"/"+b+" and "+c+"/"+d+" is equal to: ");
        reduce(subnum,subden);     // method call to reduce the fraction
    }
    void mul(int w,int x,int y, int z)     // method to multiply two fractions
    {
        a = w;
        b = x;
        c = y;
        d = z;
        int mulnum,mulden;
        mulnum = a*c;
        mulden = b*d;
        System.out.print("Multiplication of the fractions "+a+"/"+b+" and "+c+"/"+d+" is equal to: ");
        reduce(mulnum,mulden);      // method call to reduce the fraction
    }
    void div(int w,int x,int y, int z)   // method to divide two fractions
    {
        a = w;
        b = x;
        c = y;
        d = z;
        int divnum,divden;
        divnum = a*d;
        divden = c*b;
        System.out.print("Division of the fractions "+a+"/"+b+" and "+c+"/"+d+" is equal to: ");
        reduce(divnum,divden);       // method call to reduce the fraction
    }
    void reduce(int j,int k)    // method to reduce the fractions
    {
        int min;
        if(Math.abs(j)<Math.abs(k))
        {
            min = Math.abs(j);
        }
        else
        {
            min = Math.abs(k);
        }
        int gcd = 1;
        for(int i = 1;i <= min;i++)
        {
            if(j%i == 0 && k%i == 0)
            {
                gcd = i;
            }
        }
        j /= gcd;
        k /= gcd;
        System.out.println(j+"/"+k);
    }



}
