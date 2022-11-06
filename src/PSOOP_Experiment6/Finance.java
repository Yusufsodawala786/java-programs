package PSOOP_Experiment6;


    import java.util.*;
    class finance
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int TP1,TP2,TP3;
            double Amt1,Amt2,Amt3;
            System.out.print("Enter the Time period on which the interest has to be calculated in SBI bank: ");
            TP1 = sc.nextInt();
            System.out.print("Enter the Time period on which the interest has to be calculated in ICICI bank: ");
            TP2 = sc.nextInt();
            System.out.print("Enter the Time period on which the interest has to be calculated in AXIS bank: ");
            TP3 = sc.nextInt();
            SBI_Bank obj1 = new SBI_Bank(TP1);
            ICICI_Bank obj2 = new ICICI_Bank(TP2);
            Axis_Bank obj3 = new Axis_Bank(TP3);
            Amt1 = 10000*Math.pow(1+(obj1.get_rate_of_interest()/365),TP1);
            Amt2 = 12500*Math.pow(1+(obj2.get_rate_of_interest()/365),TP2);
            Amt3 = 20000*Math.pow(1+(obj3.get_rate_of_interest()/365),TP3);
            Calendar maturityDate1 = Calendar.getInstance();
            maturityDate1.add(Calendar.DAY_OF_MONTH,TP1);
            Calendar maturityDate2 = Calendar.getInstance();
            maturityDate2.add(Calendar.DAY_OF_MONTH,TP2);
            Calendar maturityDate3 = Calendar.getInstance();
            maturityDate3.add(Calendar.DAY_OF_MONTH,TP3);
            System.out.println("The Maturity date of the deposit: "+maturityDate1.getTime()+" The amount after maturity date is: "+Amt1);
            System.out.println("The Maturity date of the deposit: "+maturityDate2.getTime()+" The amount after maturity date is: "+Amt2);
            System.out.println("The Maturity date of the deposit: "+maturityDate3.getTime()+" The amount after maturity date is: "+Amt3);

        }
    }
    class Bank
    {
        double get_rate_of_interest()
        {
            return 0.02;
        }

    }
    class SBI_Bank extends Bank {
        int timePeriod;

        SBI_Bank(int x) {
            timePeriod = x;
        }

        double get_rate_of_interest() {
            if (timePeriod >= 7 && timePeriod <= 14)
            {
                return super.get_rate_of_interest() + 0.03;
            } else if (timePeriod >= 15 && timePeriod <= 30) {
                return super.get_rate_of_interest() + 0.03;
            } else if (timePeriod >= 31 && timePeriod <= 45) {
                return super.get_rate_of_interest() + 0.03;
            } else if (timePeriod >= 46 && timePeriod <= 90) {
                return super.get_rate_of_interest() + 0.0405;
            } else if (timePeriod >= 91 && timePeriod <= 120) {
                return super.get_rate_of_interest() + 0.041;
            } else if (timePeriod >= 121 && timePeriod <= 180) {
                return super.get_rate_of_interest() + 0.041;
            }
            else {return 0;}
            }

    }
    class ICICI_Bank extends Bank
    {
        int timePeriod;
        ICICI_Bank(int x)
        {
            timePeriod = x;
        }
        double get_rate_of_interest()
            {
            if(timePeriod >= 7 && timePeriod <= 14)
            {
                return super.get_rate_of_interest() + 0.031;
            }
            else if(timePeriod >= 15 && timePeriod <= 30)
            {
                return super.get_rate_of_interest() + 0.032;
            }
            else if(timePeriod >= 31 && timePeriod <= 45)
            {
                return super.get_rate_of_interest() + 0.035;
            }
            else if(timePeriod >= 46 && timePeriod <= 90)
            {
                return super.get_rate_of_interest() + 0.045;
            }
            else if(timePeriod>= 91 && timePeriod <= 120)
            {
                return super.get_rate_of_interest() + 0.047;
            }
            else if(timePeriod >= 121 && timePeriod <= 180)
            {
                return super.get_rate_of_interest() + 0.049;
            }
            else {return 0;}
            }


    }
    class Axis_Bank extends Bank
    {
        int timePeriod;
        Axis_Bank(int x)
        {
            timePeriod = x;
        }
        double get_rate_of_interest()
            {
            if(timePeriod >= 7 && timePeriod <= 14)
            {
                return super.get_rate_of_interest() + 0.0315;
            }
            else if(timePeriod >= 15 && timePeriod <= 30)
            {
                return super.get_rate_of_interest() + 0.0315;
            }
            else if(timePeriod >= 31 && timePeriod <= 45)
            {
                return super.get_rate_of_interest() + 0.0345;
            }
            else if(timePeriod >= 46 && timePeriod <= 90)
            {
                return super.get_rate_of_interest() + 0.0405;
            }
            else if(timePeriod >= 91 && timePeriod <= 120)
            {
                return super.get_rate_of_interest() + 0.047;
            }
            else if(timePeriod >= 121 && timePeriod <= 180)
            {
                return super.get_rate_of_interest() + 0.05;
            }
            else {return 0;}
            }

    }

