package stream_programs;

import java.util.List;

public class Stream_Sorting {

	public static void main(String[] args) {
		printNumberList(List.of(8,3,0,3,3,9,7,4,4,1));
	}

	private static void printNumberList(List<Integer> numbers) {

		System.out.println("Normal List : ");
		numbers.stream().forEach(System.out::println); // method reference
		System.out.println();
		
		System.out.println("Distinct List : ");
		numbers.stream().distinct().forEach(System.out::println); // method reference
		System.out.println();
		
		System.out.println("Distinct List with sorted : ");
		numbers.stream().distinct().sorted().forEach(System.out::println); // method reference
		System.out.println();
	}

}
