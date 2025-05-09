import java.util.Scanner;
public class ExcelTitle {
    public static String convertToString(int columnNumber) {
    StringBuilder sb=new StringBuilder();
    while(columnNumber>0){
        columnNumber--;
        sb.append((char)(columnNumber%26 + 'A'));
        columnNumber/=26;
    }
    return sb.reverse().toString();
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter column number: ");
    int columnNumber=sc.nextInt();

    ExcelTitle et=new ExcelTitle();
    String columnTitle=et.convertToString(columnNumber);
    System.out.println("Excel column Title: "+ columnTitle);
    }
}
