package java_fundamental;

import java.util.ArrayList;

interface Mobile
{
	public void calling(String number);
	
	public void sendMessage(String message);
}

class Apple implements Mobile
{

private ArrayList<String> contacts = new ArrayList<String>();
	
	public void addContact(String number)
	{
		contacts.add(number);
		System.out.println("number added successfully...");
	}
	
	@Override
	public void calling(String number) {
		System.out.println("calling ..... "+number);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("sending message ..... "+message);
	}
	
}

public class AbstractionDemo{
	
	public static void main(String[] args) {
		
		Apple a=new Apple();
		a.addContact("8303397441");
		a.calling("8303397441");
		a.sendMessage("hello");
		
		Samsung s = new Samsung();
		s.addContacts("123456");
		s.calling("2121");
		s.sendMessage("hii");
		
	}

}

// Abstract class can have only abstract method or method body when method is not abstract
abstract class Mobilee
{
	ArrayList<String> list = new ArrayList<String>();
	
	abstract void calling(String number);
	
	abstract void sendMessage(String message);
	
	public void addContacts(String number)
	{
		list.add(number);
	}
}

class Samsung extends Mobilee
{

	@Override
	void calling(String number) {
		System.out.println("calling....."+number);
	}

	@Override
	void sendMessage(String message) {
		System.out.println("message sent....."+message);
	}
	
}
