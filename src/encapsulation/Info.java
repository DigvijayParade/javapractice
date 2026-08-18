package encapsulation;

public class Info {

	public static void main(String[] args) {
		

	Student s1 = new Student();
	
	s1.setInfo("nanu", 10, 29);
	
	System.out.println(s1.getId());
	System.out.println(s1.getAge());
	System.out.println(s1.getName());
}
}
