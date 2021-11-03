package java_fundamental;

import java.util.ArrayList;
import java.util.List;

class College
{
	String name;
	private List<Teacher> teacher;
	public College(String name, List<Teacher> teacher)
	{
		this.name=name;
		this.teacher=teacher;
	}
	
	void dislplay()
	{
		System.out.println(name+" : "+teacher);
	}
}

class Teacher
{
	String name;
	String subject;
	public Teacher(String name, String subject)
	{
		this.name=name;
		this.subject=subject;
	}
	
	@Override
	public String toString()
	{
		return "[Teacher : "+name+" ,Subject : "+subject+"]";
	}
}

public class AggregationDemo {

	public static void main(String[] args) 
	{
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher("rishabh","java"));
		teachers.add(new Teacher("abc","python"));
		
		College college = new College("My college",teachers);
		college.dislplay();
	}

}
