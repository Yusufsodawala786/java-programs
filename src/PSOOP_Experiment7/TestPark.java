package PSOOP_Experiment7;


import java.util.Scanner;

    abstract class AmusementPark {// abstract class for abstraction
        abstract int getCost();
    }

    class Imagica extends AmusementPark {// class inheriting from abstract class
        Scanner sc = new Scanner(System.in);
        int TotalCost = 0;
        int Age;
        String Day;
        int Games[] = new int[20];// array to store data about the games

        void getData() {// method to get all info
            System.out.print("Enter your age:");
            Age = sc.nextInt();
            System.out.print("Enter's today day");
            Day = sc.next();
            int N;
            System.out.print("Enter number of games played:");
            N = sc.nextInt();
            System.out.println("Enter game numbers that you played:");
            for (int i = 0; i < N; i++) {
                int temp;
                temp = sc.nextInt();
                Games[temp - 1]++;
            }
        }

        int getCost()// method to calculate all costs
        {
            if (Age >= 21 && Age <= 60) {// applying all conditions
                TotalCost += 1500;
            } else {
                TotalCost += 1100;
            }
            for (int i = 0; i < Games.length; i++) {
                if (i >= 9 && i <= 19 && Games[i] == 1) {
                    TotalCost += 50;
                }
            }
            if (Day.equals("Sunday") || Day.equals("Saturday")) {
                TotalCost += 300;
            }
            return TotalCost;
        }

        void gamesPlayed() {// method to see which games are played
            System.out.print("The games that you have played are:");
            for (int i = 0; i < Games.length; i++) {
                if (Games[i] == 1) {
                    System.out.printf("%d,", (i + 1));
                }
            }
            System.out.print("\nThe games that you have not played are:");
            for (int i = 0; i < Games.length; i++) {
                if (Games[i] == 0) {
                    System.out.printf("%d,", (i + 1));
                }
            }
        }
    }

    class Esselword extends AmusementPark {// class esselword similar to class imagica
        Scanner sc = new Scanner(System.in);
        int TotalCost = 0;
        int Age;
        String Day;
        int Games[] = new int[15];

        void getData() {
            System.out.print("Enter your age:");
            Age = sc.nextInt();
            System.out.print("Enter's today day:");
            Day = sc.next();
            int N;
            System.out.print("Enter number of games played:");
            N = sc.nextInt();
            System.out.print("Enter game numbers that you played:");
            for (int i = 0; i < N; i++) {
                int temp;
                temp = sc.nextInt();
                Games[temp - 1]++;
            }
        }

        int getCost() {
            if (Age >= 21 &&Age <= 60) {
                TotalCost += 1050;
            } else {
                TotalCost += 660;
            }
            for (int i = 0; i < Games.length; i++) {
                if (i >= 6 && i <= 15 && Games[i] == 1) {
                    TotalCost += 50;
                }
            }
            if (Day.equals("Sunday") || Day.equals("Saturday")) {
                TotalCost += 300;
            }
            return TotalCost;
        }

        void gamesPlayed() {
            System.out.print("The games that you have played are:");
            for (int i = 0; i < Games.length; i++) {
                if (Games[i] == 1) {
                    System.out.printf("%d,", (i + 1));
                }
            }
            System.out.print("\nThe games that you have not played are:");
            for (int i = 0; i < Games.length; i++) {
                if (Games[i] == 0) {
                    System.out.printf("%d,", (i + 1));
                }
            }
        }
    }

    class TestPark {
        public static void main(String[] args) {// main method to call everything
            Scanner sc = new Scanner(System.in);
            int Choice;
            System.out.print("Enter 1 for Imagica and 0 for Esselword:");
            Choice = sc.nextInt();
            if (Choice == 1) {
                Imagica objI = new Imagica();
                objI.getData();
                objI.gamesPlayed();
                System.out.println("\nYour total cost for today was:" + objI.getCost());
            } else {
                Esselword objE = new Esselword();
                objE.getData();
                objE.gamesPlayed();
                System.out.println("\nYour total cost for today was:" + objE.getCost());
            }
        }
    }



