package week3day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection 
{
public static void main(String[] args) 
	{
                int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
	
	 List<Integer>list1=new ArrayList<Integer>();
	 List<Integer>list2=new ArrayList<Integer>();
	 
	for( int i=0;i<a.length;i++)
	{
		list1.add(a[i]);
	}

	for( int i=0;i<b.length;i++)
	{
		list2.add(b[i]);
	}
	
	
       for( int i=0;i<a.length;i++){
       for(int j=0;j<b.length;j++)
	{
	if(list1.get(i)==list2.get(j)) {
	System.out.println("Intersected numbers:"+list1.get(i));
		}
	}
}}}
		
