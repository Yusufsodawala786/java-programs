package stack;
import java.util.*;
public class Postfix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String postfix ="";
        System.out.println("Enter your string:");
        String infix = sc.nextLine();
        char[] arr = new char[infix.length()];
        for(int i=0;i<infix.length();i++)
        {
            arr[i] = infix.charAt(i);
        }
        StackX stack = new StackX(infix.length());
        for(int i=0;i<infix.length();i++)
        {
            if(arr[i]!='+'&&arr[i]!='-'&&arr[i]!='*'&&arr[i]!='/'&&arr[i]!='('&&arr[i]!=')')
            {
                postfix += arr[i];
            }
            else if(arr[i] == '(')
            {
                stack.push(arr[i]);
            }
            else if(arr[i] == ')')
            {
                while(!stack.isEmpty()) {
                    char t = stack.pop();
                    if (t != '(') {
                        postfix += t;
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
                        if(t == '(')
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
                                postfix += t;
                            }
                        }
                    }
                    stack.push(arr[i]);
                }
            }
        }
        while(!stack.isEmpty())
        {
            postfix += stack.pop();
        }
        System.out.println(postfix);
    }
}
class StackX{
    char[] stack;
    int top;
    int maxsize;
    public StackX(int y)
    {
        maxsize = y;
        stack = new char[maxsize];
        top = -1;
    }
    public void push(char x)
    {
        stack[++top] = x;
    }
    public char pop()
    {
        return stack[top--];
    }
//    public char peek()
//    {
//        return stack[top];
//    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
//    public boolean isFull()
//    {
//        return (top == maxsize-1);
//    }
    static int precedence(char c)
    {
        if(c=='+'|| c=='-')
        {
            return 1;
        }
        else
            return 2;
    }



}