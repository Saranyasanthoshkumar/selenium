package stud;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("student id:"+id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("student id:"+id+"  "+"student name:"+name);
	}
	public void getStudentInfo(String email,int phonenumber)
	{
		System.out.println("email:"+email+"  "+"phonenumber:"+phonenumber);
	}
public static void main(String[] args)
{
	Students obj=new Students();
	obj.getStudentInfo(306);
	obj.getStudentInfo(306,"saranya");
	obj.getStudentInfo("saran@gmail.com",23478912);
	
}
}
