public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10;
        System.out.print("Fibonacci Series:"+a+" "+b);//0 1
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);//1
            a=b;
            b=c;
        }
    }
}
