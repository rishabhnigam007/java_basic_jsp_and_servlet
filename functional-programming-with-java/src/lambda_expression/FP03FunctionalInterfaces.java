package lambda_expression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(8, 3, 0, 3, 3, 9, 7, 4, 4, 1);

		// these are the functional interfaces

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

		// same as like this
		/*
		 * Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { return t%2==0; }
		 * 
		 * };
		 */

		Function<Integer, Integer> squareFunction = x -> x * x;

		/*
		 * Function<Integer, Integer> squareFunctions = new Function<Integer, Integer>()
		 * {
		 * 
		 * @Override public Integer apply(Integer t) { return t*t; } };
		 */

		Consumer<Integer> sysoutConsumer = System.out::println;

		/*
		 * Consumer<Integer> sysoutConsumers = new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { System.out.println(t);
		 * 
		 * } };
		 */

		numbers.stream().filter(isEvenPredicate) // only even number
				.map(squareFunction) // square of that number
				.forEach(sysoutConsumer);

	}

}
