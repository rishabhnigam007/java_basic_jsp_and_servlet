package file_functional_programs;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;

public class File {

	public static void main(String[] args) throws IOException{
		
		Files.lines(Paths.get("C://Users//55683//eclipse-workspace//functional-programming-with-java//src//file_functional_programs//abc.txt"))
			.map(str -> str.split(" "))
			.flatMap(Arrays::stream)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		System.out.println("IF we find only directory");
		
		Files.list(Paths.get("."))
				.filter(Files::isDirectory)
				.forEach(System.out::println);
		
	}

}