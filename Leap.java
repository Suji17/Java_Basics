public class Leap {
    public static void main(String[] args) {
        int year=2000;
        if((year%4==0 && year%100!=0) ||(year%400==0)){
            System.err.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
