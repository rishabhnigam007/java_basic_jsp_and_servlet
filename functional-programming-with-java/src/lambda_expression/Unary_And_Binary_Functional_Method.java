package lambda_expression;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Unary_And_Binary_Functional_Method {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(5, 5, 6, 8, 3);

		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		Function<Integer, Integer> squareFunction = x -> x * x;
		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

		BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

		// No input > return Something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};

		System.out.println(randomIntegerSupplier.get());

		numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);

		int sum = numbers.stream().reduce(0, sumBinaryOperator);
		System.out.println("sum : " + sum);

		UnaryOperator<Integer> mul = (x) -> 3 * x;
		System.out.println("Multiply is : "+mul.apply(15));

	}

}