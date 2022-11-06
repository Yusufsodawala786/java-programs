package yusuf;




import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
    class Codechef
    {
        public static void main (String[] args) throws Exception
        {
            int T,N;
            Scanner sc = new Scanner(System.in);
            Minimum obj = new Minimum();
            T = sc.nextInt();
            for(int i = 0;i<T;i++)
            {
                N =sc.nextInt();
                int[] S = new int[N];
                for( i = 0;i < N;i++)
                {
                    S[i] = sc.nextInt();
                }
                obj.min(N,S);

                sc.close();
            }
        }
    }

    class Minimum
    {   int N;
        int[] A = new int[N];
        void min(int N,int A[])
        {
            int Min = A[1] - A[0];
            for(int i = 0;i < N;i++)
            {
                if(A[i]>A[i+1])
                {
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
            for(int i = 0;i < N;i++)
            {
                if(A[i+1] + A[i]<Min)
                {
                    Min = A[i+1] + A[i];
                }
            }
            System.out.println(Min);
        }
    }

