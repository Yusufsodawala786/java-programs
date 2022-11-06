package PSOOP_Experiment1;

import java.lang.Math;   // including the math class
public class Game{
    public static void main(String[] args)
    {
        int score1=0,score2=0;
        System.out.println("-------------------------------------------");
        System.out.println("Welcome to S.P.I.T. Roulette ");
        Random player1 = new Random();   // creating the object of the external class in main to access the methods in it
        Random player2 = new Random();
        System.out.println("Giving money to Player1....");
        System.out.println("Giving money to Player2....");
        System.out.println("Totalling....");
        for(int i = 0;i<5;i++)          // for loop to find the total of the points
        {
            score1 += player1.game();
            score2 += player2.game();
        }
        if(score1 == score2)         // condition to  decide the winner
        {
            System.out.println("ITS A DRAW!!");
            System.out.println("TOTAL MONEY OF PLAYER1 IS: "+score1);
            System.out.println("TOTAL MONEY OF PLAYER2 IS: "+score2);
        }
        else if(score1>score2)
        {
            System.out.println("CONGRTULATIONS PLAYER1 !!!! YOU HAVE WON!!!");
            System.out.println("TOTAL MONEY OF PLAYER1 IS: "+score1);
            System.out.println("TOTAL MONEY OF PLAYER2 IS: "+score2);
        }
        else
        {
            System.out.println("CONGRTULATIONS PLAYER2 !!!! YOU HAVE WON!!!");
            System.out.println("TOTAL MONEY OF PLAYER1 IS: "+score1);
            System.out.println("TOTAL MONEY OF PLAYER2 IS: "+score2);
        }
        System.out.println("-------------------------------------------");
    }

}
class Random     // the external class
{
    int game()   // method to find the scores
    {
        int score;
        score = (int)(Math.random()*1000);   // random score generator function inbuilt in java
        return score;

    }



}