package PSOOP_Experiment10;

import java.util.*;
class empty_stack extends Exception{         // class which creates the empty stack exception
    empty_stack(String s)
    {
        super(s);
    }
}
class full_stack extends Exception{      // class which creates full stack exception
    full_stack(String s)
    {
        super(s);
    }
}
public class push_pop {          // class to perform the function of push and pop
    int stack[] = new int[5];   // array for stack

    public void push(int y) {     // method to push element into stack
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (stack[i] == 0) {
                index = i;
                break;
            }
        }
        try {        // try block to check if the array is completely filled, hence no element can be pushed
            check_full(index);
            stack[index] = y;
            System.out.println(y+" has been pushed to the stack.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pop(int x) {   // method to pop the element
        int index = 0;
        for (int i = 0; i < 5; i++) {
            if (stack[i] == 0) {
                index = i;
                break;
            }
        }
        try {      // try block to chedck if the stack is empty, hence no element can be popped
            check_empty(index);
            if ((index - x) >= 0) {
                for (int i = x; i > 0; i--) {
                    stack[index-i] = 0;
                }
                System.out.println(x+" elements have been popped.");
            }
            else
            {
                System.out.println("Elements cannot be popped.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void display(){        // displays the stack after every operation
        System.out.println("The stack at the moment is:");
        for (int i = 4; i >=0 ; i--) {
            System.out.println(stack[i]);
        }
    }
    public void check_empty(int m) throws empty_stack   // method to throw the empty stack error
    {
        if (m == 0) {
            throw new empty_stack("EMPTY_STACK");
        }
    }
    public void check_full(int n) throws full_stack    // method to throw the full stack error
    {
        if (n == 4) {
            throw new full_stack("FULL_STACK");
        }
    }
}