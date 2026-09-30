package interview_prep;

public class StudentAnalyzer {

	public static void main(String[] args) {
		
		Studentopr mA = Students :: getId;//
		
		Students s1 = new Students("Nanu",101,"Male",12);
		
		System.out.print(mA.m1(s1));
	}
}
