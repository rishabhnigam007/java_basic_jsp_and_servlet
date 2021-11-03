package Design_Pattern.Behavioural_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

/*
 * Observer pattern is used when there is one-to-many relationship between objects 
 * such as if one object is modified, its dependent objects are to be notified automatically
 * This design pattern is used in : util.Eventlistener, HttpSessionBinding
 * */

abstract class Observer {
	protected Subject subject;

	public abstract void update();
}

class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
}

class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
}

public class Observer_DP {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

	}

}
