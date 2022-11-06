package PSOOP_Experiment4;

import java.util.*;

public class BookRating
{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);   // creating the scanner object
        int n;
        System.out.print("Enter the number of ratings of each book: ");
        n = sc.nextInt();
        int [][] Rating = new int[4][n];          // creating a 2-D array
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("Enter the rating of %d book",i+1);
                Rating[i][j] = sc.nextInt();
            }
        }
        Analysis obj = new Analysis();  // creating the object for the external class
        obj.average(n,Rating);          // calling the method using object

    }
}
class Analysis   // external class
{
    void average(int n,int arr[][])     // method to find average
    {
        double [] average = new double[4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<n;j++)
            {
                average[i] += (double)(arr[i][j]);
            }
            average[i] /= n;
            System.out.printf("the average rating of %d book is %.2f\n",i+1,average[i]);
        }
        double max = average[0];
        int popularBook = 1;
        for(int i=0;i<4;i++)    // checking for the most popular book
        {
            if(average[i]>max)
            {
                max = average[i];
                popularBook = i+1;
            }
        }
        System.out.printf("The Most Popular Book is book no.%d\n",popularBook);

    }
}


