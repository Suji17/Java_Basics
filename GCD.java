public class GCD {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }return a;
    }
    public static void main(String[] args) {
        int a=18,b=12;
        System.out.println("GCD OF "+a+" and "+b+" is "+gcd(a,b));
    }
}
