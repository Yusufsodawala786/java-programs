package PSOOP_Experiment9;

import java.util.*;

class lowRuns extends Exception           // class to create exception
{
    lowRuns()
    {
        super();
    }
}

class Cricket{                 // main class
    public static void main(String args[])
    {
        Cricketer [] arr = new Cricketer[11];    // array of objects to store data about the cricketers
        try                                     // try block to catch array index out of bounds excpetion
        {
            for (int i = 0; i < 11; i++)
            {
                try                            // try block to catch arraystoreexception
                {
                    arr[i] = new Cricketer();
                    System.out.println("Info for the " + (i + 1) + " player: ");
                    arr[i].get_data();
                } catch (ArrayStoreException e)
                {
                    System.out.println("ArrayStoreException: Cannot store any other type in an object.");
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: invalid index found");
        }
        Cricketer temp = new Cricketer();      // temp object for sorting
        for(int i =0;i<11;i++)                  // sorting algorithm
        {
            for(int j = 0;j<11;j++)
            {
                if(arr[i].get_avg() > arr[j].get_avg())
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        double entireAvg=0;
        for (int i = 0; i < 11; i++) {            // total batting average of the team
            entireAvg += arr[i].batting_avg;
        }
        entireAvg/=2;
        try{             // custom made error to check if the team batting average is less than 20
            Check(entireAvg);
        }
        catch(Exception e)
        {
            System.out.println("The team has a batting average of less than 20 runs.");
        }
        for(int i = 0; i < 11; i++)            // printing the details of all the player
        {
            System.out.print(arr[i].player_name+"\t");
            System.out.print(arr[i].runs_hit+"\t");
            System.out.print(arr[i].innings_count+"\t");
            System.out.print(arr[i].not_out_count+"\t");
            System.out.print(arr[i].batting_avg+"\n");
        }
    }
    static void Check(double x) throws lowRuns{         // method to throw the custom made error
        if(x<20)
        {
            throw new lowRuns();
        }
    }
}
class Cricketer         // class to store information
{
    Scanner sc = new Scanner(System.in);
    String player_name;
    int runs_hit;
    int innings_count;
    int not_out_count;
    double batting_avg;

    double get_avg()       // method to find batting average of the player
    {
        try
        {
            batting_avg =(double)(runs_hit/innings_count);
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmeticException: cannot divide by zero");
        }
        return batting_avg;
    }

    void get_data()             // method to get data
    {
        System.out.print("Enter the name of the player: ");
        player_name = sc.next();
        System.out.print("Enter the runs scored by the player: ");
        runs_hit = sc.nextInt();
        System.out.print("Enter the innings played by the player: ");
        innings_count= sc.nextInt();
        System.out.print("Enter the number of not-outs: ");
        not_out_count = sc.nextInt();
    }
}

