package PSOOP_Experiment5;
import java.util.*;

public class Recruiter {                    // main class
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);     // scanner class
        int n;
        System.out.print("Enter the number of canditates: ");
        n = sc.nextInt();
        Recruitment obj[] = new Recruitment[n];    // array of object to access methods of outer classes
        for(int i = 0;i<n;i++)
        {
            obj[i] = new Recruitment();
            obj[i].generateResult();      // method call using array of objects
        }
    }
}
    class Recruitment extends Testing   // external class (child class)
    {
        void generateResult()   // method to calculate result
        {
            takeTest();
            int score = 0;
            for(int i =0;i<8;i++)
            {
                if(submittedAnswers[i] == correctAnswers[i])
                {
                    score++;
                }
            }
            double percentage ;
            percentage = (double)((score/8)*100);
            if(percentage >= 60)
            {
                System.out.println("\ncongratulations!! You have been recruited!!\n");
            }
            else
            {
                System.out.println("\nSorry!! Better Luck next time!!\n");
            }

        }

    }
    class Testing   // parent class
    {
        Scanner sc = new Scanner(System.in);
        int[] submittedAnswers = new int[8];   // array of input answers
        int[] correctAnswers = {1,3,4,4,1,3,2,1};   // array of correct answers
        void takeTest()   // menu method to prvide the questionnaire
        {
            System.out.print("Section 1:How much interest the applicant takes in his work?\n");
            System.out.print("Question 1:What is the vision of the company?\n1.Money\n2.Social Welfare\n3.Fame\n4.Justice\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[0] = sc.nextInt();
            System.out.print("Question 2:How long will you stay in this role?\n1. 30 years\n2. 20 years\n3. 40 years\n4. 10 years\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[1] = sc.nextInt();
            System.out.print("Section 2:'Specialization’ of the applicant in any particular area?\n");
            System.out.print("Question 1:What is final method in Java?\n1. Last method in Java\n2. public static void main\n3. A method that can be overriden.\n4. A method that cannot be overriden\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[2] = sc.nextInt();
            System.out.print("Question 2:What is the latest version of Java?\n1. Java 1\n2. Java ultimate\n3. Java 17\n4. Java 18.\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[3] = sc.nextInt();
            System.out.print("Section 3:Whether the applicant was capable of learning through training or not?\n");
            System.out.print("Question 1:What did you learn about Java in last job?\n1. OOP\n2. public static void main\n3. Inheritance.\n4. Pain\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[4] = sc.nextInt();
            System.out.print("Question 2:What do you wish to learn?\n1.Java\n2.C++\n3.Python\n4.What is life.\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[5] = sc.nextInt();
            System.out.print("Section 4:How much capability a person has to mix-up with other persons, and whether he can influence other persons and get influenced by them?\n");
            System.out.print("Question 1:What makes a team successful?\n1. Vision\n2. Unity\n3. Co-operation\n4. Dedication\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[6] = sc.nextInt();
            System.out.print("Question 2:Do you work faster in team or as individual?\n1.Team\n2.Individual\n");
            System.out.print("Enter your answer: ");
            submittedAnswers[7] = sc.nextInt();
        }
    }

