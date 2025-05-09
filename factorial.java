public class factorial {
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
        //one line solution
        //return (n==1||n==0)?1:n*fact(n-1)
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("factorial of "+num+"is "+fact(num));
    }
}
