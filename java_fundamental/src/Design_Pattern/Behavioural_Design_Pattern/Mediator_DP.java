package Design_Pattern.Behavioural_Design_Pattern;

import java.util.Date;

interface Mediator {
	public void showMessage(User user, String message);
}

class ChatRoom implements Mediator {
	@Override
	public void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [ " + user.getName() + " ] " + " : " + message);
	}

}

class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Here sendMessage is a mediator method
	// This design pattern used in concurrent package and time class
	
	public void sendMessage(String message) {
		ChatRoom cr = new ChatRoom();
		cr.showMessage(this, message);
	}
}

public class Mediator_DP {

	public static void main(String[] args) {

		User rishabh = new User("rishabh");
		User rishu = new User("rishu");

		rishabh.sendMessage("hello");
		rishu.sendMessage("hii");

	}

}
