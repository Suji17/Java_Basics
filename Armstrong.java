import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter from ");
        int a=sc.nextInt();
        System.err.println("Enter to");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
        int num=i;
        int temp=num;
        int value=0;
            while(num!=0){
            int rem=num%10;//371%10->1,37%10->7,3%10->3
            value+=rem*rem*rem;//1*1*1->1,1+7*7*7->294,294+3*3*3*->371
            num/=10;//371/10->37,37/10->3,3/10->0
            }
            if(temp==value) {
                System.out.println(temp);
            
            }
        }
    }
}
