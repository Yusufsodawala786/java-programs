package PSOOP_Experiment3;

public class Date {
    public  static void main(String args[])
    {
        Date1 obj = new Date1();    // creating object for external class in main to access its methods
        obj.setDate(2020,6,25);     // method call
        obj.setDate(2021,4,24,12,24);    // method call
        obj.setDate(2022,4,30,1,7,27);    // method call
    }

}
class Date1      // external class
{  int flag = 0;
    int year,date;
    String month,hrs,min,sec;
    Date1()      // constructor to set the values of the variables
    {
        year = 2000;
        month = "January";
        date = 1;
        hrs = "00";
        min = "00";
        sec = "00";
    }
    void setDate(int a , int b , int c)    // method to set date only upto the year month and date
    {
        flag = 1;
        year = a;
        Switch(b);  // method call
        date = c;
        displayDate();
    }
    void setDate(int a , int b , int c,int d,int e)  // this method displays years,months,date,hours and minutes
    {
        flag = 2;
        year = a;
        Switch(b);
        date = c;
        hrs = String.valueOf(d);
        min = String.valueOf(e);
        displayDate();
    }
    void setDate(int a , int b , int c, int d, int e, int f)  // this method displays years,months,date,hours,minutes and seconds
    {
        flag = 3;
        year = a;
        Switch(b);
        date = c;
        hrs = String.valueOf(d);   // inbuilt function to find the value represented by the string
        min = String.valueOf(e);
        sec = String.valueOf(f);
        displayDate();   // method call
    }
    void displayDate()   // this methods displays the date at the console
    {	if(flag == 1)
        System.out.println("the date is:"+month+","+date+","+year);
    else if(flag == 2)
        System.out.println("the date is:"+month+","+date+","+year+","+hrs+":"+min);
    else
        System.out.println("the date is:"+month+","+date+","+year+","+hrs+":"+min+":"+sec);
    }

    void Switch(int b)   // this method finds the month that is to be displayed
    {
        switch(b)
        {
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default:
                break;
        }
    }
}
