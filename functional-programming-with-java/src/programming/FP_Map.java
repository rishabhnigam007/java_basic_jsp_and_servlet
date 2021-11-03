package programming;

import java.util.List;

public class FP_Map {

	public static void main(String[] args) {
		printSquareNumberListFunctional(List.of(1,3,5,7,9));
	}

	private static void printSquareNumberListFunctional(List<Integer> numbers) {
		// what to do ?
		numbers.stream()
		.map(number -> number*number)		
		.forEach(System.out::println); // method reference
	}
}