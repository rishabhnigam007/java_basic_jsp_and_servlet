package custom_classes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return name + " : " + noOfStudents + " : " + reviewScore;
	}

}

public class Custom_Classes_with_function {

	public static void main(String[] args) {

		List<Course> course = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 20000), new Course("API", "Microservices", 98, 20000),
				new Course("MicroServices", "MicroServices", 96, 20000),
				new Course("FullStack", "Fullstack", 91, 200000), new Course("AWS", "Cloud", 98, 20000),
				new Course("Azure", "Cloud", 99, 20000), new Course("Docker", "Cloud", 98, 20000),
				new Course("kubernates", "Cloud", 91, 20000));

		Comparator<Course> comparingstudentWithReview = Comparator.comparingInt(Course::getNoOfStudents)
				.thenComparingInt(Course::getReviewScore).reversed();

		System.out.println(course.stream().sorted(comparingstudentWithReview).collect(Collectors.toList()));
		
		System.out.println("\nLimit is 5 : only five are appear");
		System.out.println(course.stream().sorted(comparingstudentWithReview).limit(5).collect(Collectors.toList()));
		
		System.out.println("\nSkip 3 : starting 3 are skipped");
		System.out.println(course.stream().sorted(comparingstudentWithReview).skip(3).collect(Collectors.toList()));
		
		System.out.println("\nMAX : "+course.stream().max(comparingstudentWithReview));

		System.out.println("\nMIN : "+course.stream().min(comparingstudentWithReview));

		System.out.println("\nSum : "+course.stream()
		.filter(courses -> courses.getReviewScore()>95)
		.mapToInt(Course::getNoOfStudents)
		.sum()); //120000

		System.out.println("\nAverage : "+course.stream()
		.filter(courses -> courses.getReviewScore()>95)
		.mapToInt(Course::getNoOfStudents)
		.average()); //20000
		
		System.out.println("\nCount : "+course.stream()
		.filter(courses -> courses.getReviewScore()>95)
		.mapToInt(Course::getNoOfStudents)
		.count()); //6
		
		System.out.println("\nMax course score : "+course.stream()
		.filter(courses -> courses.getReviewScore()>95)
		.mapToInt(Course::getNoOfStudents)
		.max()); //6
		
		System.out.println("\nGroupingBy : "+course.stream()
		.collect(Collectors.groupingBy(Course::getCategory))); 
		
		System.out.println("\nCount with GroupingBy : "+course.stream()
		.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()))); 
		
	}

}
