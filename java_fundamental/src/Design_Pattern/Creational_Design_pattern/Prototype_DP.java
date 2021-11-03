package Design_Pattern.Creational_Design_pattern;

class Address implements Cloneable {
	private String city;
	private String pinCode;

	public Address(String city, String pinCode) {
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}

class Customer implements Cloneable {
	private String name;
	private Address address;

	public Customer(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// This code is for deep cloning so object can't be same 
	public Object clone() throws CloneNotSupportedException {
		Customer customer = (Customer) super.clone();
		customer.address = (Address) this.address.clone();
		return customer;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
}

public class Prototype_DP {

	public static void main(String[] args) throws CloneNotSupportedException {

		Customer originalObj = new Customer("Rishabh", new Address("Kanpur", "208011")); 		  
		Customer clonedObj=(Customer)originalObj.clone(); 
		
		System.out.println("Original Object properties: "); 
		System.out.println(originalObj);
		
		System.out.println("Cloned Object properties: ");  
		System.out.println(clonedObj);

		//Change in cloned object
		clonedObj.getAddress().setPinCode("208023");

		System.out.println();
		System.out.println("original object : "+originalObj);
		System.out.println("clone object : "+clonedObj);
	}

}
