package Design_Pattern.Behavioural_Design_Pattern;

/* 1. one command interface
   2. one request class
   3. one concrete class
   4. one invoker class
   5. take execute command*/

// 1.
interface ICommandAC
{
	public void execute();
}

// 2.
class AC
{
	public void turnOn()
	{
		System.out.println("AC is on");
	}
	public void turnOff()
	{
		System.out.println("AC is off");
	}
	public void decTemp()
	{
		System.out.println("Decreasing temperature by 1");
	}
	public void incTemp()
	{
		System.out.println("Increasing temperature by 1");
	}
}

// 3.
class StartACCommand implements ICommandAC
{
	AC ac;
	public StartACCommand(AC ac)
	{
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		System.out.println("Turning on the AC");
		ac.turnOn();
	}
	
}

//3.
class StopACCommand implements ICommandAC
{
	AC ac;
	public StopACCommand(AC ac)
	{
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		System.out.println("Turning off the AC");
		ac.turnOff();
	}
	
}

//3.
class IncreaseACCommand implements ICommandAC
{
	AC ac;
	public IncreaseACCommand(AC ac)
	{
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		System.out.println("Increase AC Command");
		ac.incTemp();
	}
	
}

//3.
class DecreaseACCommand implements ICommandAC
{
	AC ac;
	public DecreaseACCommand(AC ac)
	{
		this.ac=ac;
	}
	
	@Override
	public void execute() {
		System.out.println("Decrease AC Command");
		ac.decTemp();
	}
	
}

// 4.
class ACAutomationRemote
{
	ICommandAC command;

	public void setCommand(ICommandAC command) {
		this.command = command;
	}
	
	// 5.
	public void buttonPressed()
	{
		command.execute();
	}
}

public class Command_DP {

	public static void main(String[] args) {
		AC acRoomOne = new AC();
		AC acRoomTwo = new AC();
		
		ACAutomationRemote remote = new ACAutomationRemote();
		remote.setCommand(new StartACCommand(acRoomOne));
		remote.buttonPressed();
		
		remote.setCommand(new StartACCommand(acRoomTwo));
		remote.buttonPressed();

	}

}
// you need to specify Queue and execute request at different times.