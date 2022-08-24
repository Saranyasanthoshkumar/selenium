package week3day2;
import java.util.HashSet;
import java.util.Set;
public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="saranya";
		
		char[] ch=new char[name.length()];
		
	
		for(int i=0;i<name.length();i++) {
			ch[i]=name.charAt(i);
		}
		
		Set<Character>charSet=new HashSet<Character>();
	
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=(' ')) {
				charSet.add(ch[i]);
			}
		}
		//Print the set
		System.out.println("Print the Unique Characters:"+charSet);
	}

}
		
