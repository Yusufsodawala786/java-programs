    package yusuf;

    import PSOOP_Experiment10.push_pop;     // importing another file from another package

    import java.util.*;

    class TestStack {      // main class
        public static void main(String[] args) {
            int Choice;      // taking input from the user
            Scanner sc = new Scanner(System.in);
            push_pop obj = new push_pop();     // object creation
            for(;;)
            {
                obj.display();      // method call to print values
                System.out.print("Enter 1 for push and 0 for pop:");      // menu for the user
                Choice = sc.nextInt();
                if (Choice==0) {        // if choice is zero popping of elements is performed
                    System.out.print("Enter number of elements to pop:");
                    int n = sc.nextInt();
                    obj.pop(n);
                }
                else{               // else elements are pushed in the stack
                    System.out.print("Enter element to push:");
                    int x = sc.nextInt();
                    obj.push(x);
                }
                // asks user if they want to continue with the program or end it
                System.out.print("Enter 1 to continue with operations and 0 to end:");
                int innerChoice = sc.nextInt();
                if (innerChoice==0) {
                    break;
                }
            }
        }
    }
