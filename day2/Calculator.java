package week1.day2;

public class Calculator {
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public double mul(double num1,double num2)
	{return num1*num2;
	}
	public float divide(float num1,float num2)
	{return num1/num2;
	}
		public static void main(String[] args){
		Calculator cal=new Calculator();
		System.out.println("Addition:"+cal.add(1,2,3));
		System.out.println("Subtraction:"+cal.sub(3,2));
		System.out.println("multiplication:"+cal.mul(5,6));
		System.out.println("Division:"+cal.divide(15,3));
	}}


