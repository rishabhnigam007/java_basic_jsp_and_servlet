package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining_And_FlapMap {

	public static void main(String[] args) {

		List<String> course = List.of("My","name","is","rishabh","nigam");
		
		System.out.println(
				course.stream()
				.collect(Collectors.joining(" ")));
		
		System.out.println(
				course.stream()
				.collect(Collectors.joining(",")));
		
		System.out.println(
				course.stream()
				.collect(Collectors.joining(" ")));
		
		System.out.println(
				course.stream()
				.map(courses -> courses.split(""))
				.flatMap(Arrays::stream)
				.collect(Collectors.toList()));
		
		System.out.println(
				course.stream()
				.map(courses -> courses.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(Collectors.toList()));
				
	}

}