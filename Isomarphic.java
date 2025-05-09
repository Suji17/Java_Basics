//package Java_Programs;
import java.util.Scanner;
public class Isomarphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String str1=sc.nextLine();
		System.out.println("Enter String 2: ");
		String str2=sc.nextLine();
		boolean result=isIsomarphic(str1,str2);
		System.out.println("Isomarphic result :"+ result);
		sc.close();
	}
	public static boolean isIsomarphic(String str1,String str2) {
		int[] str1arr=new int[200];
		int[] str2arr=new int[200];
		
		if(str1.length()!=str2.length()) return false;
		
		for(int i=0;i<str1.length();i++) {
			if(str1arr[str1.charAt(i)]!=str2arr[str2.charAt(i)]) {
				return false;
			}
			str1arr[str1.charAt(i)]=i+1;
			str2arr[str2.charAt(i)]=i+1;
		}
		return true;
	}
}
