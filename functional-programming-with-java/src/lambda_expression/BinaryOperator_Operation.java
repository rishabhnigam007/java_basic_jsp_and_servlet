package lambda_expression;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperator_Operation {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(8,3,0,3,3,9,7,4,4,1);
		
		BinaryOperator<Integer> sumBinaryOperation = Integer::sum;	
		
		int sum = numbers.stream()
				.reduce(0, sumBinaryOperation);
		System.out.println("sum is : "+sum);
		
	}

}
