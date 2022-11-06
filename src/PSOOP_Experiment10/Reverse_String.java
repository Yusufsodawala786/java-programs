package PSOOP_Experiment10;

public class Reverse_String // the class to perform the string reversal
{
    public void reverseit(String Napolean)   // method to perform string reversal
    {
        int len = Napolean.length();   // length of the string
        char Naelopan [] = new char[len];   // character array creation
        for(int i=0;i<len;i++)
        {
            Naelopan[i] = Napolean.charAt(len-i-1);     // string reversal
        }
        System.out.println(String.valueOf(Naelopan));   // printing the resulting string
    }
}
