package PSOOP_Experiment8;

public class TestCard {                  // main class
    public static void main(String[] args) {
        PrintCard obj = new PrintCard();   // object creation
        System.out.println("This program initializes,shuffles and prints the 52 cards in a deck.");
        obj.newCard();  // method call to get a new card
        obj.shuffle();  // method call to shuffle every single card
        for(int i = 0 ;i<52;i++)   // print the shuffled deck
        {
            System.out.print(obj.CardName(i)+" ");
            if(i == 12|| i == 25|| i == 38||i == 51)  // leave the line after every 13 cards
            {
                System.out.println();
            }
        }
    }
}
interface rankT{   // interface to define the ranks of the cards
    String[] rankT = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
}
interface suitT{     // interface to define the suit of the card
    String[] suitT = {"S", "C", "H", "D"};
}
interface cardT{   // interface to join the suit and rank to form  a card
    void newCard();
}
class PrintCard implements rankT,suitT,cardT {   // implementing the interface in class PrintCard
    String cards[] = new String[52];

    public void newCard() {  // method to combine rank and suit
        int a = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[a] = rankT[j] + suitT[i];
                a++;
            }
        }
    }
    String CardName( int x){
        return cards[x];
    }   // method to return the card
    void shuffle(){   // method to shuffle the deck
        for (int i = 0;i<100;i++)
        {
            int x = (int)(Math.random()*52);
            int y = (int)(Math.random()*52);
            String temp = cards[x];
            cards[x] = cards[y];
            cards[y] = temp;
        }
    }
}
