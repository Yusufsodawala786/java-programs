package college;
import java.util.*;


public class Vowel_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int count = 0;

        for(int i = 0;i < s.length();i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
