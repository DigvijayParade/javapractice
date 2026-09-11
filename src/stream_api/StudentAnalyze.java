package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentAnalyze {

	public static void main(String[] args) {
		
		StudentAnalyze obj = new StudentAnalyze();
		
		ArrayList<StudentData> stdData = obj.getstdData();
		
		Stream<StudentData> stdDataSet = stdData.stream();
		
		Predicate <StudentData> age20  = (e) -> e.getAge() > 20 ;
		
		stdDataSet.filter(age20).forEach(e ->System.out.println(e.getName()));
		
		System.out.println("////////////////////");
//		Predicate<StudentData> csDep = (e) -> "Computer Science".equalsIgnoreCase(e.getDep());
		stdData.stream().filter(e -> "Computer Science".equalsIgnoreCase(e.getDep()))
		.forEach(e -> System.out.println(e.getName()));
		
		
		
	}
	
	public ArrayList<StudentData> getstdData (){
		
		return new ArrayList<>(List.of(
				new StudentData("Alice", 101, 20, 2, "Computer Science"),
				new StudentData("Bob", 102, 22, 4, "Mechanical"),
				new StudentData("Charlie", 103, 21, 3, "Computer Science"),
				new StudentData("David", 104, 19, 1, "Electrical"),
				new StudentData("Eva", 105, 22, 4, "Computer Science"),
				new StudentData("Frank", 106, 20, 2, "Civil"),
				new StudentData("Grace", 107, 21, 3, "Electrical"),
				new StudentData("Hannah", 108, 19, 1, "Mechanical")
			));
	}
}
