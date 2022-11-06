package PSOOP_Experiment4;

import java.util.*;

public class Movie
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);      // creating the scanner object
        int n;
        System.out.print("Enter the number of movies: ");
        n = sc.nextInt();
        MovieAnalysis obj[] = new MovieAnalysis[n];   // creating an array of oobject
        String Name, genre, Hero, Heroine;
        int Budget;
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Input the information for movie no.: %d\n", i + 1);
            System.out.print("Enter the name of the movie: ");
            Name = sc.next();
            System.out.print("Enter the genre of movie: ");
            genre = sc.next();
            System.out.print("Enter Hero's name: ");
            Hero = sc.next();
            System.out.print("Enter Heroine's name: ");
            Heroine = sc.next();
            System.out.print("Enter the movie budget: ");
            Budget = sc.nextInt();
            obj[i] = new MovieAnalysis();
            obj[i].set(Name, genre, Hero, Heroine, Budget);
        }
        MovieAnalysis temp = new MovieAnalysis();   // creating a temporary object
        int option,option1;
        for (; ; )
        {
            System.out.print("Enter option corresponding to your need!!\n1. sort according to budget\n 2. print movie names starting with S/A\n 3. sort movies according to name length\n Enter option: ");
            option = sc.nextInt();
            if (option == 1)
            {
                for (int i = 0; i < n; i++)             // sorting according to the budget
                {
                    for (int j = i + 1; j < n; j++)
                    {
                        if (obj[i].Budget < obj[j].Budget)
                        {
                            temp = obj[i];
                            obj[i] = obj[j];
                            obj[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++)
                {
                    System.out.println(obj[i].Name + "\t" + obj[i].genre + "\t" + obj[i].Hero + "\t" + obj[i].Heroine + "\t" + obj[i].Budget);
                }
            }
            else if (option == 2)
            {
                for (int i = 0; i < n; i++)   // printing the movies with name Starting with S/A
                {
                    if (obj[i].Name.charAt(0) == 'S' || obj[i].Name.charAt(0) == 'A')
                    {
                        System.out.println(obj[i].Name + "\t" + obj[i].genre + "\t" + obj[i].Hero + "\t" + obj[i].Heroine + "\t" + obj[i].Budget);
                    }
                }

            }
            else if (option == 3) {
                for (int i = 0; i < n; i++)      // sorts movie according to its name length
                {
                    for (int j = i + 1; j < n; j++)
                    {
                        if (obj[i].Name.length() < obj[j].Name.length())
                        {
                            temp = obj[i];
                            obj[i] = obj[j];
                            obj[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++)
                {
                    System.out.println(obj[i].Name + "\t" + obj[i].genre + "\t" + obj[i].Hero + "\t" + obj[i].Heroine + "\t" + obj[i].Budget);
                }
            }
            System.out.print("Enter  1 if you want to continue or 0 if you wabt to exit!! : ");
            option1 = sc.nextInt();
            if( option1 == 1)
            {
                continue;
            }
            else
            {
                System.out.println("Thank you!! Bye");
                break;
            }

        }
    }
}
class MovieAnalysis           // external classes
{
    String Name,genre,Hero,Heroine;
    int Budget;
    void set(String a,String b,String c,String d,int e)   // method to set values
    {
        Name = a;
        genre = b;
        Hero = c;
        Heroine = d;
        Budget = e;
    }
}
