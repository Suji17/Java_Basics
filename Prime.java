public class Prime {
    public static void main(String[] args) {
        int n=17;
        boolean isPrime=true;
        if(n<=1) isPrime=false;
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0) isPrime=false; break;
            }isPrime=true;
        }
        if(isPrime) System.out.println(n+"is Prime");
        else System.out.println(n+"is not Prime");
    }
}
