package java_fundamental;

public class DepartmentDriver 
{
	public static void main(String[] args) 
	{
		DeptOne one = new DeptOne();
		int emp = one.getEmployee();
		System.out.println("Department one has : "+emp+" employee");
		one.attendance();
		
		Department.a=10;
		Department.displayValue();
		
		
	}
}