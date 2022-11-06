package stack;
import java.util.*;

public class Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = "";
        System.out.println("Enter your string:");
        String infix = sc.nextLine();
        char[] arr = new char[infix.length()];
        for(int i=0;i<infix.length();i++)
        {
            arr[i] = infix.charAt(i);
        }
        StackX stack = new StackX(infix.length());
        for(int i = infix.length()-1;i>=0;i--)
        {
            if(arr[i]!='+'&&arr[i]!='-'&&arr[i]!='*'&&arr[i]!='/'&&arr[i]!='('&&arr[i]!=')')
            {
                prefix += arr[i];
            }
            else if(arr[i] == ')')
            {
                stack.push(arr[i]);
            }
            else if(arr[i] == '(')
            {
                while(!stack.isEmpty()) {
                    char t = stack.pop();
                    if (t != ')') {
                        prefix += t;
                    } else {
                        break;
                    }
                }
            }
            else if(arr[i]=='+'||arr[i]=='-'||arr[i]=='*'||arr[i]=='/')
            {
                if(stack.isEmpty())
                    stack.push(arr[i]);
                else
                {
                    while(!stack.isEmpty())
                    {
                        char t = stack.pop();
                        if(t == ')')
                        {
                            stack.push(t);
                            break;
                        }
                        else if(arr[i]=='+'||arr[i]=='-'||arr[i]=='*'||arr[i]=='/')
                        {
                            if(stack.precedence(t)<stack.precedence(arr[i]))
                            {
                                stack.push(t);
                                break;
                            }
                            else
                            {
                                prefix += t;
                            }
                        }
                    }
                    stack.push(arr[i]);
                }
            }
        }
        while(!stack.isEmpty())
        {
            prefix += stack.pop();
        }
        System.out.println(prefix);
    }
}

