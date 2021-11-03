package programming;

import java.util.List;

public class FPFunctional {

	public static void main(String[] args) {
		printAllNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		printEvenNumberListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printAllNumberInListFunctional(List<Integer> numbers) {
		System.out.println("list : ");
		numbers.stream().forEach(System.out::println);
		System.out.println("sorted list with only even : ");
	}

	// number -> number % 2 == 0
	private static void printEvenNumberListFunctional(List<Integer> numbers) {
		// what to do ?
		numbers.stream().filter(number -> number % 2 == 0) // Lambda Expression
				.forEach(System.out::println); // method reference
	}
}