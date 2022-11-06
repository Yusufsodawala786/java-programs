package PSOOP_Experiment3;

import java.util.*;     // including the class to use inbuilt functions

class Employee
{
    public static void main(String args[])
    {
        int option;
        Scanner sc  = new Scanner(System.in);    // creating scanner object
        System.out.print("ENTER THE CORRESPONDING OPTION FOR YOUR DESIRED JOB :-\n1. Programmer\n2. Team Leader\n3. Project Manager\nenter option: ");  // menu for the user
        option = sc.nextInt();
        if(option == 1)   // conditions to be checked based on the option selected
        {
            int courseWork,AptTest,TechTest,interview;
            System.out.print("enter the marks of your Course Work: ");
            courseWork = sc.nextInt();
            System.out.print("enter the marks of your Aptitude Test: ");
            AptTest = sc.nextInt();
            System.out.print("enter the marks of your Tech Test: ");
            TechTest = sc.nextInt();
            System.out.print("enter the marks of your Interview: ");
            interview = sc.nextInt();
            Posting obj = new Posting(courseWork,AptTest,TechTest,interview);  // creating object for external class in main to access its methods
        }
        else if(option == 2)
        {
            int TechTest,interview;
            System.out.print("enter the marks of your Tech Test: ");
            TechTest = sc.nextInt();
            System.out.print("enter the marks of your Interview: ");
            interview = sc.nextInt();
            Posting obj = new Posting(TechTest,interview);   // creating object for external class in main to access its methods
        }
        else if(option == 3)
        {
            int interview;
            System.out.print("enter the marks of your Interview: ");
            interview = sc.nextInt();
            Posting obj = new Posting(interview);   // creating object for external class in main to access its methods
        }
        else
        {
            System.out.println("Sorry!! but the job that you desire is not offered by our company");
        }


    }

}

class Posting   // external class
{
    int courseWork,AptTest,TechTest,interview,flag = 0;

    Posting(int courseWork, int AptTest, int TechTest, int interview)   // parameterized constructor
    {
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;
        flag = 1;       // flag to set condition
        selection();   // method call
    }
    Posting(int TechTest, int interview)    // use of constructor overloading
    {
        this.TechTest = TechTest;
        this.interview = interview;
        flag = 2;
        selection();
    }
    Posting(int interview)
    {
        this.interview = interview;
        flag = 3;
        selection();
    }
    void selection()    // method to perform selection of candidates
    {
        if(flag == 1)   // check conditions
        {
            if(courseWork+AptTest+TechTest+interview >= 80)
                System.out.println("Congratulations!! You are now a member of our company.");
            else
                System.out.println("Sorry!! You are not eligible for this job");
        }
        else if(flag == 2)
        {
            if(TechTest+interview >= 85)
                System.out.println("Congratulations!! You are now a member of our company.");
            else
                System.out.println("Sorry!! You are not eligible for this job");
        }
        else if(flag == 3)
        {
            if(interview >= 90)
                System.out.println("Congratulations!! You are now a member of our company.");
            else
                System.out.println("Sorry!! You are not eligible for this job");
        }
    }
}

