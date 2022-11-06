package PSOOP_Experiment3;

class Tests
{
    public static void main(String args[])
    {
        Test obj = new Test();      // creating object of the external class to acces its methods
        obj.calculate(2,4);  // calling the methods
        obj.Display();                      // display method call
        obj.calculate(2.0,4);
        obj.Display();
    }
}

class Test       // external class
{
    double Base;
    int power,argument,logbase;
    int flag = 0;
    Test()       // constructor to set the value of the variables
    {
        Base = 2.0;
        power = 2;
        argument = 2;
        logbase = 2;
    }
    double calculate(double Base, int power)  // method to find power of a number
    {
        this.Base = Base;
        this.power = power;
        flag = 1;
        double x =  Math.pow(Base,power);
        return x;
    }
    double calculate(int logbase, int argument)    // method to find log of a number
    {
        this.logbase = logbase;
        this.argument = argument;
        flag = 2;
        double y =  Math.log(argument)/Math.log(logbase);
        return y;
    }
    void Display()   // method to display the output
    {
        if(flag == 1)
            System.out.println(Base+"^"+power+" = "+calculate(Base,power));
        else if(flag == 2)
            System.out.println("log"+logbase+" "+argument+" = "+calculate(logbase,argument));
    }

}