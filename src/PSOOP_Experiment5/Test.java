package PSOOP_Experiment5;
import java.util .*;

 class Stock {      // external class  (parent class)
        String Name;
        double[] Prices;   // array of inputs

        Stock(String Name, double[] Prices) {    // parametrized constructor to set the values
            this.Name = Name;
            this.Prices = Prices;
        }
    }

    class Transaction extends Stock {          // child class
        double totalProfit;

        void findMaxProfit() {        // methos to find profit
            int stIndex = 0;
            for (int i = 0; i < Prices.length - 1; i++) {         // for loop to check the prices iin order to buy and sell the stock
                if (Prices[i] < Prices[i + 1]) {
                    stIndex = i;
                    for (int j = stIndex; j < Prices.length - 1; j++) {
                        if (Prices[j] > Prices[j + 1]) {
                            System.out.print("\nBuy on day " + (stIndex + 1) + " and sell on day " + (j + 1));
                            totalProfit += Prices[j] - Prices[stIndex];
                            i = j;
                            break;
                        }
                        if (j == Prices.length - 2) {
                            System.out.print("\nBuy on day " + (stIndex + 1) + " and sell on day " + (j + 2));
                            i = j;
                            totalProfit += Prices[j + 1] - Prices[stIndex];
                        }
                    }
                }
            }
        }

        Transaction(String Name, double[] Prices) {  // parametrized constructor
            super(Name, Prices);
            totalProfit = 0;
        }
    }

  public class Test {              // main class
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);        // taking inputs
            System.out.print("Enter the name of the stock: ");
            String Name = sc.next();
            System.out.print("Enter the number of prices to be stored: ");
            int Num = sc.nextInt();
            double[] Prices = new double[Num];       // array
            System.out.println("\nEnter the prices one by one\n");
            for (int i = 0; i < Prices.length; i++) {
                System.out.print("Price-" + (i + 1) + " :");
                Prices[i] = sc.nextDouble();
            }
            Transaction tr = new Transaction(Name, Prices);  // object creation
            tr.findMaxProfit();   // method call using object
            System.out.print("\n\nThe maximum profit that can be earned is Rs." + tr.totalProfit);
        }
    }



