public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapWithThirdVariable(a,b);
        swapWithoutThirdVariable(a,b);
        swapUsingXOR(a,b);
    }

    static void swapWithThirdVariable(int a, int b) {
        System.out.println("Before Swapping a="+ a +" b= "+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("After Swapping WithThirdVariable "+" a="+a+" b= "+b);
    }

    static void swapWithoutThirdVariable(int a, int b) {
        System.out.println("Before Swapping WithoutThirdVariable "+"a="+ a +" b= "+b);
        a=a+b;//10+20=30
        b=a-b;//30-20=10
        a=a-b;//30-10=20
        System.out.println("After Swapping "+"a="+a+" b= "+b);
    }
    static void swapUsingXOR(int a, int b) {
        System.out.println("Before Swapping "+"a="+ a +" b= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping UsingXOR "+"a="+a+" b= "+b);
    }

}
