package Design_Pattern.Behavioural_Design_Pattern;

interface EmployeeState
{
	public void work();
	public void canApproveLeave();
}

class Employee
{
	@SuppressWarnings("unused")
	private String designation;
	private EmployeeState employeeState;
	
	public Employee(String designation) {
		setDesignation(designation);
	}

	public void working()
	{
		employeeState.work();
	}
	
	public void authorities()
	{
		employeeState.canApproveLeave();
	}
	
	private void setDesignation(String designation) {
		this.designation=designation;
		if(designation.equals("HR"))
			employeeState = new HR();
		else if(designation.equals("Developer"))
			employeeState = new Developer();
		else if(designation.equals("Manager"))
			employeeState = new Managers();
		else
			employeeState = new Developer();
	}
}

class Developer implements EmployeeState
{

	@Override
	public void work() {
		System.out.println("Work : have to complete the task assigned by Senior Management");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve Leave : Yes, Developer can approve the leave of trainee");
	}
	
}

class HR implements EmployeeState
{

	@Override
	public void work() {
		System.out.println("Work : Recruitment resources for Organisation");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve Leave : NO, HR can not approve the leave of trainee");
	}
	
}

class Managers implements EmployeeState
{
	@Override
	public void work() {
		System.out.println("Work : Design the project architecture for the Organisation");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can approve Leave : Yes, Manager can approve the leave");
	}
	
}

class State_DP {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("HR");
		emp1.working();
		emp1.authorities();
		
		Employee emp2 = new Employee("Developer");
		emp2.working();
		emp2.authorities();
		
		Employee emp3 = new Employee("Manager");
		emp3.working();
		emp3.authorities();
		
	}

}
