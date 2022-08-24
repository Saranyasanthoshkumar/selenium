package week3day2;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String args[]) {
		
	int[] data= {1,2,3,4,5,6,8,9,10};
	Set<Integer>set=new TreeSet<Integer>();
	for(int i=0;i<data.length;i++)
	{
	set.add(data[i]);
	}
	System.out.println(set);
	List<Integer>list=new ArrayList<Integer>(set);
	int j=0;
		for(int i=list.get(0);i<=list.get(list.size()-1);i++)
			if(list.get(j) == i) {
				j++; 
			
			
			}else {
				System.out.println("Missing numbers is: "+i);

			}
		}
}


