package PSOOP_Experiment9;

import java.util.*;
class Vaccine        // main class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);      // scanner object
        System.out.print("Enter the distance between two vaccines: ");
        int distance = sc.nextInt();
        try      // to catch the invalidageexception
        {
            validate(distance);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static public void validate(int x) throws InvalidAgeException       // creating a custom exception
    {
        if(x <=84 || x>=100)
        {
            throw new InvalidAgeException("Access denied :- you are not eligible for the vaccine");
        }
        else
        {
            System.out.println("You are eligible for the vaccine!!");
        }
    }
}
class InvalidAgeException extends Exception      //  extended exception class
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

