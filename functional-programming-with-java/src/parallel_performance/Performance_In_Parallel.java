package parallel_performance;

import java.util.List;

public class Performance_In_Parallel {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();

		List<Integer> numbers = List.of(5, 5, 6, 8, 3);
		int sum = addListStructured(numbers);
		System.out.println(sum);
		// time comes in 1 second
		System.out.println(System.currentTimeMillis() - time);

		int sum1 = addListFunctional(numbers);
		System.out.println(sum1);

		// time comes in millisecond
		System.out.println(System.currentTimeMillis() - time);

	}

	// this is doing with functional way and parallelizing

	private static int addListFunctional(List<Integer> numbers) {

		return numbers.stream().parallel().reduce(0, Integer::sum);
	}

	// this one doing in structure way

	private static int addListStructured(List<Integer> numbers) {

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
