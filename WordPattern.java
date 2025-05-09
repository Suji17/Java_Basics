//package Java_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pattern: ");
		String pattern=sc.nextLine();
		System.out.println("Enter String: ");
		String str=sc.nextLine();
		boolean result=wordPattern(pattern,str);
		System.out.println("Pattern match result: "+result);
		sc.close();
	}
	
	public static boolean wordPattern(String pattern,String str) {
		//split the string
		String[] words=str.split(" ");
		
		//check len
		if(words.length!=pattern.length()) return false;
		//map for char->word ,word->char
		Map<Character,String>chartoword=new HashMap<>();
		Map<String,Character>wordtochar=new HashMap<>();
		
		for(int i=0;i<pattern.length();i++)
		{
			char ch=pattern.charAt(i); //a->b->..
			String word=words[i];      //dog->cat..
			
			//check char->word mapping
			if(chartoword.containsKey(ch)){
				if(!chartoword.get(ch).equals(word)) return false;
			}
			else {
				chartoword.put(ch, word);
			}
			
			//check word->char mapping
			if(wordtochar.containsKey(word)) {
				if(wordtochar.get(word)!=ch) return false;
			}else {
				wordtochar.put(word, ch);
			}
		}
		//if everything is matches,its true;
		return true;

	}

}
