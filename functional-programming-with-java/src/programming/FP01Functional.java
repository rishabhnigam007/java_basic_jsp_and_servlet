package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		printAllNumberInListStructure(List.of(12,9,13,4,6,2,4,12,15));
		
	}
	
	private static void print(int number)
	{
		System.out.println(number);
	}

	private static void printAllNumberInListStructure(List<Integer> numbers) {
		
		System.out.println("List without sorted : ");
		numbers.stream().forEach(FP01Functional::print);
		
		/*
		private static void print(int number)
		{
			System.out.println(number);
		}
		replace with 
		
		// this is called method reference
		
		number.stream().forEach(System.out::println);
		
		 */
		
		System.out.println("List with sorted : ");
		numbers.stream().sorted().forEach(FP01Functional::print);

	}
}