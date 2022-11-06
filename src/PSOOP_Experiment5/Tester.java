package PSOOP_Experiment5;
import java.util.*;

public class Tester {                  // main class
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    // scanner class
        String name;
        String id;
        int age;
        double empsalary;
        SalariedEmployee obj[] = new SalariedEmployee[5];   // array of objects
        for(int i=0;i<5;i++)       // taking inputs
        {
            System.out.print("Enter the name of the employee: ");
            name = sc.next();
            System.out.print("Enter the id of the employee: ");
            id = sc.next();
            System.out.print("Enter the age of the employee: ");
            age = sc.nextInt();
            System.out.print("Enter the salary of the given employee: ");
            empsalary = sc.nextDouble();
            obj[i] = new SalariedEmployee(name,id,age,empsalary);
        }
        SalariedEmployee temp = new SalariedEmployee("a","o",18,0.00);   // temporary array of objects
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(obj[i].getter1()>obj[j].getter1())  // sorting by salary
                {
                    temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
            obj[i].get();      // method calls
            obj[i].getter();
        }

    }
}

    class Employee       // parent class
    {
        private String name;
        private String id;
        private int age;

        Employee(String x,String y, int z)   // parametrized constructor
        {
            set(x,y,z);   // calls the set method to set values of the parameters
        }
        public void get()   // method to print values of the employee
        {
            System.out.print(name +"\t"+ id +"\t"+ age);
        }
        public void set(String a,String b,int c)  // set method to set the characteristics of employee
        {
            name = a;
            id = b;
            age = c;
        }

    }

    class SalariedEmployee extends Employee    // child class
    {
        private double empsalary;
        private String emptype;
        SalariedEmployee(String name,String id, int age, double empsalary)  // parametrized constructor
        {
            super(name,id,age);          // super keyword to call vakues from the parent class
            Scanner sc = new Scanner(System.in);
            String X;
            System.out.print("Enter the type of employee: ");
            X = sc.next();
            setSalary(empsalary,X);   // mehtod call to set salary variables
        }
        void setSalary(double sal,String type)   // salary method to set values
        {
            empsalary = sal;
            emptype = type;
            if(emptype.equals("permanent"))  // condition to add bonus
            {
                empsalary +=  2000;
            }
            else
            {
                empsalary = sal;
            }

        }
        public double getter1()       // method which returns salary of employee to main class
        {
            return empsalary;
        }

        public void getter()   // prints the values for the employee
        {
            System.out.println(" "+emptype +" "+ empsalary);
        }

    }



