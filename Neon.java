public class Neon {
    public static void main(String[] args) {
        int n=9;
        int square=n*n;//81
        int sum=0;
        while(square>0){//81>0,8>0,0>0
            sum+=square%10;//81%10->1,1+8%10->9
            square/=10;//81/10->8,8/10->0
        }//9==9
        if(n==sum) System.out.println("Neon number");
        else System.out.println("Not");
    }
}
