package functional_programming;

import java.util.Arrays;

public class Stream_Array_Method {

	public static void main(String[] args) {

		int numberArray[] = {8,3,0,3,3,9,7,4,4,1};
		
		System.out.println("Sum : "+Arrays.stream(numberArray).sum());

		System.out.println("Count : "+Arrays.stream(numberArray).count());

		System.out.println("Average : "+Arrays.stream(numberArray).average());

		System.out.println("Min : "+Arrays.stream(numberArray).min());

		System.out.println("Max : "+Arrays.stream(numberArray).max());

		
	}

}
