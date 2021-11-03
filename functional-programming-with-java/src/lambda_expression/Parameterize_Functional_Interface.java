package lambda_expression;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Parameterize_Functional_Interface {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 5, 6, 8, 3);

		filterAndEvenPrint(numbers, x -> x % 2 == 0);
		System.out.println();
		filterAndOddPrint(numbers, x -> x % 2 != 0);
	}

	private static void filterAndEvenPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void filterAndOddPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}