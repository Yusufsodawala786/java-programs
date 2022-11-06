package algorithms;

public class testBooth {
    public static void main(String[] args) {
        Booth obj = new Booth();
        obj.initialize(-4,9);
        obj.print(-4,9);
    }
}
class Booth{

    int multiplicand[];
    int multiplier[];
    int complement[];
    int Q;
    int count;
    int[] convertToBinary(int x)
    {
        int m = noOfiBit(x);
        int i = 0;
        int number[]  = new int[m+1];
        int temp = x;
        if(temp>0) {
            while (temp > 0) {
                number[i] = temp % 2;
                i++;
                temp /= 2;
            }
            number[i] = 0;
        }
        else {
            while (Math.abs(temp) > 0) {
                number[i] = Math.abs(temp) % 2;
                i++;
                temp /= 2;
            }
            number[i] = 1;
        }
        return number;
    }
    int noOfiBit(int x)
    {
        int i = 1;
        int temp = x;
        while(Math.abs(temp)>0)
        {
            temp /= 2;
            i++;
        }
        return i;
    }
    void initialize(int num1, int num2)
    {
        if(Math.abs(num1)>Math.abs(num2)) {
            multiplicand = new int[noOfiBit(num1) + 1];
            multiplier = new int[noOfiBit(num1) + 1];
            count = noOfiBit(num1);
        }
        else if(Math.abs(num1)<Math.abs(num2))
        {
            multiplicand = new int[noOfiBit(num2) + 1];
            multiplier = new int[noOfiBit(num2) + 1];
            count = noOfiBit(num2);
        }
        Q = 0;
    }
    void print(int m,int n) {

        multiplicand = convertToBinary(m);
        multiplier = convertToBinary(n);
        for (int i = count-1;i>=0;i--)
        {
            System.out.print(multiplicand[i]);
        }
        System.out.println();
        for (int i = count-1;i>=0;i--)
        {
            System.out.print(multiplier[i]);
        }
    }
}