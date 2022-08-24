package week3day2;
import java.util.HashSet;
import java.util.Set;
	public class RemoveDuplicates {

		public static void main(String[] args) {		
			
			String name="PayPal India";
			
			char[] ch=new char[name.length()];
			
			Set<Character>charSet=new HashSet<Character>();
			
			Set<Character>dupCharSet=new HashSet<Character>();
			
			for(int i=0;i<name.length();i++)
			{
				ch[i]=name.charAt(i);
			}
			
			for(int i=0;i<ch.length;i++) {
		
				if(ch[i]!=(' ')) 
				{
				
					if(charSet.add(ch[i])==false) 
					{
						dupCharSet.add(ch[i]);
					}
					else
					{
						charSet.add(ch[i]);
					}
				}
			}
			System.out.println("Unique character" +charSet);
			System.out.println("Duplicate character" +dupCharSet);
			}}
