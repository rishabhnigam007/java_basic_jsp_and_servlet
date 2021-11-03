package lambda_expression;

import java.util.List;

public class Method_Reference {
	
	private static void print(String str)
	{
		System.out.print(str+" ");
	}

	public static void main(String[] args) {
		
		List<String> courses = List.of("spring","spring boot","aws","api","microservices","pcf","azure","docker","kubernate");
		
		courses.stream()
		.map(str -> str.toUpperCase())
		//.forEach(System.out::println);
		//or
		.forEach(Method_Reference::print);
		
		System.out.println("\n---------------");
		
		courses.stream()
		.map(String::toUpperCase)
		.forEach(str -> System.out.print(str+" "));
		
	}

}
