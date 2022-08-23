package college;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name:SARANYA");
	}
public void studentDept()
{
	System.out.println("Dept :IT");
}
public void studentId()
{
	System.out.println("Id:306");
}
public static void main(String[] args) {
	 Student obj= new Student();
	 obj.collegeName();
	 obj.collegeCode();
	 obj.collegeRank();
	 obj.departmentName();
	 obj.studentName();
	 obj.studentDept();
	 obj.studentId();
	 
}
}
