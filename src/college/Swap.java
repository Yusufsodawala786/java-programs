package college;

public class Swap {
    public static void main(String[] args) {
          Swap1 s1=new Swap1(10,5);
          System.out.println(s1.a+" "+s1.b);
          s1.swapn(s1);
        System.out.println(s1.a+" "+s1.b);
    }
}
class Swap1{
    int a,b;
    Swap1(int x,int y){
        a=x;
        b=y;
    }
    void swapn(Swap1 s){
        int t=s.a;
        s.a=s.b;
        s.b=t;
    }
}
