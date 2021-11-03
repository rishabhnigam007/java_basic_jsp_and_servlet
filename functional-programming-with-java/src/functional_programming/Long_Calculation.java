package functional_programming;

import java.util.stream.IntStream;

public class Long_Calculation {

	public static void main(String[] args) {
		
		System.out.println("Maximum value of long : "+Long.MAX_VALUE);
		
		System.out.println("Minimum value of long : "+Long.MIN_VALUE);
		
		System.out.println("Range in Integer : "+IntStream.rangeClosed(1, 20).reduce(1, (x,y)->x*y));

		//System.out.println("Range : "+LongStream.rangeClosed(1, 50).reduce(1, (x,y) -> x*y));

	}

}
