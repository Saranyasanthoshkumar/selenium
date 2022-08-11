package week1.day2;


public class learnMethods {
public void printCarBrand()
{
	 System.out.println("Audi");
	}
public String carColor()
{
	return "grey";
		}
public int engineNumber()
{
	return 456448867;
	}
public int subTwoNumbers(int a,int b)
{
	int c=a-b;
	return c;}
public double mulTwoNumbers(int a,int b) 
{
	int d=a*b;
	return d;
}
public float divTwoNumbers(int a,int b)
{
	int e=a/b;
	return e;
}
public static void main(String[] args) {
	learnMethods obj=new learnMethods();
    obj.printCarBrand();
	System.out.println("Car color:"+obj.carColor());
	System.out.println("Engine number:"+obj.engineNumber());
	System.out.println("subtraction:"+obj.subTwoNumbers(5,3));
	System.out.println("multiplication:"+obj.mulTwoNumbers(2,3));
	System.out.println("Division:"+obj.divTwoNumbers(6,3));
}
}
	

	
	
