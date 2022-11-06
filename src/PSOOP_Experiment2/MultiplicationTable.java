package PSOOP_Experiment2;

import java.util.*;  // import class to use inbuilt functions

class MultiplicationTable    // main class
{
    public static void main(String[] args)
    {
        int denominator;
        Scanner sc = new Scanner(System.in);  // creating the scanner object

        System.out.println("Enter the denominator: ");
        denominator = sc.nextInt();
        table obj = new table();   // creating object for external class to access its methods
        obj.method(denominator);   // calling the method from the external class

    }
}

class table   // external class
{
    void method(int den)     // method to multiply two fractions
    {
        int b= den;
        for(int i = 1;i < den;i++)
        {
            for(int j = 1;j < den;j++)
            {
                int gcd = reduce(j*i,b*b);
                System.out.print("\t"+j*i+"/"+b*b+"\t");
            }
            System.out.println();
        }
    }
    int reduce(int j,int k)     // method to reduce the fractions
    {
        int min;
        if(j<k)
        {
            min = j;
        }
        else
        {
            min = k;
        }
        int gcd = 1;
        for(int i = 1;i <= min;i++)
        {
            if(j%i == 0 && k%i == 0);
            {
                gcd = i;
            }
        }
        return gcd;
    }



}
