import java.util.Scanner;
public class PrimeToN {
    static boolean isPrime(int num){
        if(num<2) return false;
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0) return false;
            }return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n=sc.nextInt();
        System.out.println("\nPrime numbers from 0 to "+n);
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+"");
            }
        }
        sc.close();
    }
}
