package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class JsMani {

	public static void main(String[] args) {
		
		List<JustAclass> aList = List.of(
				
//					new JustAclass(1,"Nanu",90000.00),
					new JustAclass(2,"Gannu",80000.45),
					new JustAclass(3,"Bunny",40000.00),
					new JustAclass(4,"Sunny",65000.00),
					new JustAclass(),
					new JustAclass(6,"Sonty",20000)
				);
		
		Optional<JustAclass> highsalary = aList.stream()
								.max(Comparator.comparingDouble(JustAclass::getSalary));
		
		Optional<JustAclass> lowsalary = aList.stream()
				.min(Comparator.comparingDouble(JustAclass::getSalary));
		
		aList.stream().filter(j -> j.getSalary() > 60000.00)
									.forEach(System.out::println);
		
		Optional<JustAclass> isNanuHere = aList.stream()
											.filter(j -> j.getName() != null)
											.filter(j -> j.getName().equalsIgnoreCase("nanu"))
											.findAny();
				
		System.out.println(highsalary.get());
		System.out.println(lowsalary.get());
//		System.out.println(rich);
		System.out.println(isNanuHere);
	}
}
