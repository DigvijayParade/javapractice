package collection_framworks;

import java.util.HashSet;
import java.util.Set;

public class SetInOut {

	public static void main(String[] args) {
		
		Set <StudentData> stdData = new HashSet<>(Set.of(new StudentData("nanu",101),
				new StudentData("Swara", 102),
				new StudentData("Nanu",101)));
		
		System.out.println(stdData.size());
		System.out.println(stdData);
		
	
	}
}
