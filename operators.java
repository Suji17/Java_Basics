import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value for a : ");
        int a=sc.nextInt();
        System.out.println("Enter value for b : ");
        int b=sc.nextInt();
        
        int choice;
        do{
        System.out.println("--------Operator types-------- ");
        System.out.println("1. Unary");
        System.out.println("2. Arithmatic");
        System.out.println("3. Realtional");
        System.out.println("4. Logical");
        System.out.println("5. Assignment");
        System.out.println("6. Ternary");
        System.out.println("7. Bitwise");
        System.out.println("8. Shift");
        System.out.println("9. Instanceof");
        System.out.println("10. Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        
        switch(choice){
            case 1: showUnary(a); break;
            case 2: showArithmatic(a,b); break;
            case 3: showRelational(a,b); break;
            case 4: showLogical(); break;
            case 5: showAssignment(a,b); break;
            case 6: showTernary(a,b); break;
            case 7: showBitwise(a,b); break;
            case 8: showShift(a); break;
            case 9: showInstanceOf(); break;
            case 10: System.out.println("Exiting...");break;
        }
    }while(choice!=10);
    sc.close();
    }
    static void showUnary(int a){
        System.out.println("Unary Operation");
        System.out.println("+a = "+(+a));
        System.out.println("-a = "+(-a));
        System.out.println("++a = "+(++a));
        System.out.println("--a = "+(--a));
        System.err.println("a++ = "+(a++));
        System.err.println("a-- = "+(a--));
    }

    static void showArithmatic(int a,int b){
        System.out.println("\nArithmatic Operations: ");
        System.out.println("a + b: "+(a+b));
        System.out.println("a - b: "+(a-b));
        System.out.println("a * b: "+(a*b));
        System.out.println("a / b: "+(a/b));
        System.out.println("a % b: "+(a%b));
    }
    static void showRelational(int a, int b) {
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }

    static void showLogical() {
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }

    static void showAssignment(int a, int b) {
        int c = a;
        System.out.println("\nAssignment Operators:");
        System.out.println("Initial c = " + c);
        c += b; System.out.println("c += b: " + c);
        c -= b; System.out.println("c -= b: " + c);
        c *= b; System.out.println("c *= b: " + c);
        c /= b; System.out.println("c /= b: " + c);
        c %= b; System.out.println("c %= b: " + c);
    }

    static void showTernary(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b is: " + max);
    }

    static void showBitwise(int a, int b) {
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
    }

    static void showShift(int a) {
        System.out.println("\nShift Operators:");
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >>> 1 = " + (a >>> 1)); // Unsigned right shift
    }

    static void showInstanceOf() {
        String s = "Sujitha";
        boolean result = s instanceof String;
        System.out.println("\ninstanceof Operator:");
        System.out.println("s instanceof String: " + result);
    }

}
