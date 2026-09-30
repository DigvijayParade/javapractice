package interview_prep;

import java.util.*;

public class StdCollect {

	public static void main(String[] args) {
		
//		ArrayList <Students> stdlist = new ArrayList<>();
//		LinkedList<Students> stdlist = new LinkedList<>();
		TreeSet <Students> stdlist = new TreeSet<>(Comparator.comparing(Students::getId));
//		-		stdlist.add(new Students("Aarav", 101, "Male", 10));
		stdlist.add(new Students("Ananya", 102, "Female", 12));
		stdlist.add(new Students("Rohan", 103, "Male", 11));
		stdlist.add(new Students("Priya", 104, "Female", 10));
		stdlist.add(new Students("Vikram", 105, "Male", 12));
		stdlist.add(new Students("Sneha", 106, "Female", 11));
		stdlist.add(new Students("Karan", 107, "Male", 10));
		stdlist.add(new Students("Neha", 108, "Female", 12));
		stdlist.add(new Students("Rahul", 109, "Male", 11));
		stdlist.add(new Students("Pooja", 110, "Female", 10));

		stdlist.removeIf(s -> s.getId() == 103);
		
		for(Students s : stdlist) {
			
			System.out.println(s);
		}
//	}
		
}
}

