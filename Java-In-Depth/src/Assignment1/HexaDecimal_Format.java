package Assignment1;

import java.math.BigDecimal;

public class HexaDecimal_Format {

	public static void primitives() {
		System.out.println("Inside primitives ....");
		
		int intHex = 0x004a; // 16 power 0 *a(10) + 16 power 1 *4
		System.out.println("Hexadecimal to decimal : "+intHex);
	
		int intBinary = 0b1111;
		System.out.println("Binary to decimal : "+intBinary);
		
		int intOctal = 000_010;
		System.out.println("Octal to decimal : "+intOctal);
		
		int intBinary1 = 0b1111_1111;
		System.out.println("Binary1 to decimal : "+intBinary1);
		
	}

	public static void main(String[] args) {

		primitives();
		
		long phone = +91_830_339_7441L;
		System.out.println(phone);
		
		System.out.println(1-0.9);
		
		BigDecimal first = new BigDecimal("0.1");
		BigDecimal second = new BigDecimal("0.2");
		System.out.println(first.add(second));
		
		char c = 66;
		System.out.println("Character is : "+c);
		System.out.println("Character ASCII value is : "+(int)c);

		int x = 99;
		System.out.println("character is : "+(char)x);
		
		int a = 'd';
		System.out.println("integer value is : "+a);
		
	}

}
