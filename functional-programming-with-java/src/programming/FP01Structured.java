package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumberInListStructure(List.of(12,9,13,4,6,2,4,12,15));
		
	}

	private static void printAllNumberInListStructure(List<Integer> numbers) {
		
		for(Integer n : numbers)
		{
			System.out.println(n);
		}
		
	}

}
