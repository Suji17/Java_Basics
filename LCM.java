public class LCM {
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;//temp=12,10,2
            b=a%b;//b=10%12 -> 10,2,0
            a=temp;//a=12,10,2
        }return a;//2
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);//(10*12)/2 ->60
    }
    public static void main(String[] args) {
        int a=10,b=12;
        System.out.println("LCM of "+a +" and "+b+" is:"+lcm(a,b));
    }
}
