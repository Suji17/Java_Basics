public class AddTwoBinary {
    public static void main(String[] args) {
        String a="1010";
        String b="0110";
        int bitA=Integer.parseInt(a,2);//convert this binary to decimal, value=10
        int bitB=Integer.parseInt(b,2);//value=6
        //int sum=bitA+bitB;
        String result=Integer.toBinaryString((bitA+bitB));//convert decimal to binary(10+6=16 ->10000)
        System.out.println("Adding Two Binary String: "+result);
    }
}
