public class Marks {

	public static void main(String[] args) {
		
		Marks st1 = new Marks();
		Marks st2 = new Marks();
		st1.result("Ruturaj", 34);
		st2.result("Digvijay", 99);
	}
	
	public void result(String name, int mark) {
		
		if(mark >= 70) {
			System.out.println(name + " is pass");
		} else {
			System.out.println(name + " is fail");
		}
		
		int score = mark / 10;
		String grade;
		
		switch (score) {
		
			case 10:
			case 9:
				grade = "A";
				break;
				
			case 8:
				grade = "B";
				break;
				
			case 7:
				grade = "C";
				break;
				
			default:
				grade = "F";
				break;
		}
		
		System.out.println(name + " grade is " + grade);
	}
}