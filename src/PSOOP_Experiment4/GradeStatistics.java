package PSOOP_Experiment4;

import java.util.*;

public class GradeStatistics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // creating the scanner object
        int n;
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        int[] grades = new int[n];       // cresting an integer array
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the grade of student: %d ", i + 1);   // input the grades of the students
            grades[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {                     // sorting the array
            if (grades[i - 1] > grades[i]) {
                int temp = grades[i - 1];
                grades[i - 1] = grades[i];
                grades[i] = temp;
            }
        }
        GradeCalculation obj = new GradeCalculation();              // creating the object of the external class
        System.out.printf("The average is: %.2f\n", obj.average(n, grades));
        System.out.printf("The Minimum is: %d\n", obj.minimum(n, grades));
        System.out.printf("The Maximum is: %d\n", obj.maximum(n, grades));
        System.out.printf("The Median is: %.2f\n", obj.median(n, grades));
        System.out.printf("The standard Deviation is: %.2f\n", obj.StandardDeviation(n, grades));

    }
}
class GradeCalculation        // external class
{
    double average(int n,int arr[])       // method to find average
    {
        double sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum += (double)(arr[i]);
        }
        double average = sum/n;
        return average;
    }
    int maximum(int n,int arr[])      // method to find maximum
    {
        int max = arr[n-1];
        return max;
    }
    int minimum(int n,int arr[])    // method to find minimum
    {
        int min = arr[0];
        return min;
    }
    double median(int n,int arr[])     // method to find median
    {
        double median ;
        if(n%2 == 0)
        {
            median = ((arr[(n/2)-1]+arr[(n/2)])/2);
            return median ;
        }
        else
        {
            median = arr[(n/2)-1];
            return median;

        }

    }
    double StandardDeviation(int n,int arr[])        // method to find standard deviation
    {
        double SD = 0;
        double mean = average(n,arr);
        for(int i = 0;i<n;i++)
        {
            SD += (double)((arr[i]-mean)*(arr[i]-mean));
        }
        SD /= n;
        SD = Math.pow(SD,0.5);
        return SD;
    }
}

