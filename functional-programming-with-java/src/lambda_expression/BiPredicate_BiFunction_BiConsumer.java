package lambda_expression;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class BiPredicate_BiFunction_BiConsumer {

	public static void main(String[] args) {

		// It takes only one operand
		UnaryOperator<Integer> unaryOperator = x -> 4 * x;
		System.out.println("Result : " + unaryOperator.apply(11));

		// It return only boolean value
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number < 10 && str.length() > 5;
		};
		System.out.println(biPredicate.test(5, "in28minutes"));

		// Here we write business logic
		// here third parameter is for return type i.e string return type here
		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + str;
		};
		System.out.println(biFunction.apply(3, "idiot"));

		
		// Consumer is basically for printing purpose 
		// It has no return type
		BiConsumer<String, String> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept("rishabh", "hello");
	}

}
