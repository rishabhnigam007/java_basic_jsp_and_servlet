package parallel_performance;

import java.util.stream.LongStream;

public class Parallelizing {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		
		// 0, 1000000000 484
		//System.out.println(LongStream.range(0, 1000000000).sum());
		
		// 0, 1000000000 182
		// parallel run at least 10-15% more faster than normal 
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);

	}

}
