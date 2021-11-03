package junit_testing;

import java.util.ArrayList;
import java.util.List;

public class StudentTestDrive {

	private String name;
	private String gender;

	public StudentTestDrive(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public static void main(String[] args) {
		StudentTestDrive student1 = new StudentTestDrive("rishabh", "male");

		StudentTestDrive student2 = new StudentTestDrive("rishu", "male");

		List<StudentTestDrive> list = new ArrayList<StudentTestDrive>();
		list.add(student1);
		list.add(student2);

		for (StudentTestDrive student : list) {
			String name = student.getName();
			String gender = student.getGender();
			printNameAndGender(name, gender);
		}

	}

	public static void printNameAndGender(String name, String gender) {
		System.out.println("Name : " + name + " Gender : " + gender);
	}

}