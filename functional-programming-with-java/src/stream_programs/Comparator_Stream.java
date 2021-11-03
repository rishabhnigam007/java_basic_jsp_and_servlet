package stream_programs;

import java.util.Comparator;
import java.util.List;

public class Comparator_Stream {

	public static void main(String[] args) {
	
		List<String> number = List.of("aws","api","azure","docker","kubernates","microservices","pcf","spring","spring boot");

		number.stream()
		.sorted(Comparator.comparing(numbers -> numbers.length()))
		.forEach(System.out::println);
		
	}

}