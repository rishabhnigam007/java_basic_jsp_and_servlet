package Assignment1;

import java.util.Scanner;

public class Byte_Datatype {

	public static void main(String[] args) {

		int id = 1000;
		byte age = 24;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rank here : ");
		byte rank = sc.nextByte();
		System.out.println("Enter phone number here : ");
		long phone = sc.nextLong();
		System.out.println("id : "+id);
		System.out.println("age : "+age);
		System.out.println("rank : "+rank);
		System.out.println("phone number : "+phone);
		sc.close();
		
		// You can put underscore in between long variable while it have been initialize
		long ph = +91_83033_9744_1L;
		System.out.println("For Better Readability : "+ph);
		
	}

}
