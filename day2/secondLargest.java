package week1.day2;
import java.util.Arrays;

public class secondLargest {
	public static void main(String[] args)
	{
		int[] n= {22,67,8,1,4,58,99};
		Arrays.sort(n);
		System.out.println(n[n.length-2]);
	}
	}
