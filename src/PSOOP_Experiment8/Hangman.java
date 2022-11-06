package PSOOP_Experiment8;

import java.sql.SQLOutput;
import java.util.*;
class Hangman
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        System.out.print("I will guess a secret word. on each turn, you guess\na letter. if the letter  is in the secret word, I\nwill show you where it appears; if not, a part of\nyour body gets strung up to the scaffold, The\nobjective is to guess the word before you are hung.\n");
        working obj = new working();   // object creation
        obj.InitDictionary();          // method call to get a set of words
        String hangmanWord = obj.ChooseRandomWord();   // method call to select a word from the dictionary
        char letters[] = new char[hangmanWord.length()];  // character array of length same as the word
        int guesses = 8;
        for(int i = 0;i<hangmanWord.length();i++)  // initializing the character array with _
        {
            letters[i] = '_';
        }
        for(;;)   // loop to check every letter
        {
            int flag = 0,flag1 = 0;
            System.out.print("The word now looks like this: ");
            for(int i=0;i<hangmanWord.length();i++)   // print initial step
            {
                System.out.print(letters[i]);
            }
            System.out.print("\n");

            char guess ;  // user input guesses

            System.out.printf("You have %d guesses left!\n",guesses);
            System.out.print("guess a letter: ");
            guess = sc.next().charAt(0);
            for(int k=0;k<hangmanWord.length();k++)
            {
                if(guess == hangmanWord.charAt(k))   // if guess is correct do as follows
                {
                    letters[k] = guess;
                    System.out.println("That guess is correct.");
                    flag=1;
                }
            }
            if(flag == 0)   // if guess is incorrect do as follows
            {
                guesses--;
                System.out.println("There are no "+guess+"'s in the word.");
            }
            for(int j=0;j<letters.length;j++)
            {
                if(letters[j] == hangmanWord.charAt(j))  // for every correct guess increment flag
                {
                    flag1++;
                }
            }
            if(flag1 == hangmanWord.length())   // if flag equals the length of the string print you won
            {
                System.out.println("That guess is correct!!");
                System.out.println("you guessed the word: "+hangmanWord);
                System.out.println("You win!!");
                break;
            }
            if(guesses == 0)  // if guesses equals zero print you lose
            {
                System.out.println("you are out of guesses, You Lost!!");
                break;
            }
        }
    }
}
interface randword    // interface to choose random word
{
    public void InitDictionary();
    public String ChooseRandomWord();
}
class working implements randword   //class to make a dictionary of random words
{
    static String words[] = new String[20];
    public void InitDictionary()
    {
        words[0] = "computer";
        words[1] = "hangman";
        words[2] = "traditional";
        words[3] = "instructions";
        words[4] = "desktop";
        words[5] = "windows";
        words[6] = "linux";
        words[7] = "ubuntu";
        words[8] = "macintosh";
        words[9] = "saad";
        words[10] = "virus";
        words[11] = "trojan";
        words[12] = "malware";
        words[13] = "repositories";
        words[14] = "skyline";
        words[15] = "programming";
        words[16] = "pnuemonoultramicroscopicsilicovolcanoconiosis";
        words[17] = "fahrenhite";
        words[18] = "celsius";
        words[19] = "temperature";
    }
    public String ChooseRandomWord()  // class to choose a random word from the dictionary
    {
        int RandomWord = (int)(Math.random()*9);
        return words[RandomWord];
    }
}
