package PSOOP_Experiment1;


public class Mersenne
{
    public static void main(String[] args)
    {
        System.out.println("The Mersenne prime numbers are: ");
        int p;
        Mersenne1 obj = new Mersenne1();    // creating an object for external class in mai to access its methods
        for(p=2;p<=31;p++)
        {
            double Mersenne;
            Mersenne = Math.pow(2,p)-1.0;    // mersenne prime no. formula
            int flag;
            flag = obj.checkPrime(Mersenne);      // calling the method from external class
            if(flag == 0)
            {
                System.out.println(Mersenne+" "+p);
            }

        }

    }

}
class Mersenne1          // external class
{
    int checkPrime(double x)    // method to check if the number is mersenne prime or not
    {
        int i ;
        int flag = 0;
        for(i = 2;i<x;i++)
        {
            if(x%i == 0)
            {
                flag++;
            }
        }
        return flag;
    }
}


