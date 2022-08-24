package week3day2;

import java.util.Set;
import java.util.HashSet;

public class PrintDuplicateNumbers {


		public static void main(String[] args) {

			int[] data = {4,3,6,8,29,1,2,4,7,8};
				Set<Integer>set=new HashSet<Integer>();
				for(int i=0;i<data.length;i++)
				{
	
			  if(set.add(data[i]) ==false) {
					System.out.println("Duplicate values: "+data[i]);
				}
		
				}
		}}
	


