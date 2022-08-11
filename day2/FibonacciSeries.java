package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		for(int i=0;i<=11;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(""+sum);
		}
	}

}
