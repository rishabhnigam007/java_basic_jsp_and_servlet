package Assignment1;

public class Min_Max_Values {

	byte minValue = Byte.MIN_VALUE;
	byte maxValue = Byte.MAX_VALUE;
	
	short minValue1 = Short.MIN_VALUE;
	short maxValue1 = Short.MAX_VALUE;
	
	int minValue2 = Integer.MIN_VALUE;
	int maxValue2 = Integer.MAX_VALUE;
	
	long minValue3 = Long.MIN_VALUE;
	long maxValue3 = Long.MAX_VALUE;
	
	void display()
	{
		System.out.println("Minimun value of Byte is : "+minValue);
		System.out.println("Maximum value of Byte is : "+maxValue);
		System.out.println();
		System.out.println("Minimun value of Short is : "+minValue1);
		System.out.println("Maximum value of Short is : "+maxValue1);
		System.out.println();
		System.out.println("Minimun value of Integer is : "+minValue2);
		System.out.println("Maximum value of Integer is : "+maxValue2);
		System.out.println();
		System.out.println("Minimun value of Long is : "+minValue3);
		System.out.println("Maximum value of Long is : "+maxValue3);
		
	}
	
	public static void main(String[] args) {

		Min_Max_Values mmv = new Min_Max_Values();
		mmv.display();
		
	}

}
