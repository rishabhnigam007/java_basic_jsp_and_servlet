package functional_programming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Print_100_Number {

	public static void main(String[] args) {

		System.out.println(IntStream.range(1, 10).sum());
		
		System.out.println(IntStream.rangeClosed(1, 10).sum());

		System.out.println(IntStream.iterate(1, e -> e+2).limit(10).sum());

		System.out.println(IntStream.iterate(1, e -> e+2).limit(10).peek(System.out::println).sum());

		System.out.println(IntStream.iterate(2, e -> e*2).limit(10).boxed().collect(Collectors.toList()));
		
	}

}
