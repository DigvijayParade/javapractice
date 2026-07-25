package array;

import java.util.*;

public class ObjectAr {
	
	String stdname;
	String depName;
	int yearofstud;
	double cgpa;
	
	public ObjectAr(String stdname, String depName, int yearofstud, double cgpa) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		this.stdname = sc.nextLine();
		System.out.println("Enter Dep Name: ");
		this.depName = sc.nextLine();
		System.out.println("Enter year: ");
		this.yearofstud = sc.nextInt();
		System.out.println("Enter CGPA: ");
		this.cgpa = sc.nextDouble();
	}
	
	public static void normal() {
		ObjectAr [] detail = new ObjectAr[5];
		
		detail[0] = new ObjectAr("nanu", "mca", 2, 9.61);
		detail[3] = new ObjectAr("monu", "engenerring", 2, 6.9);
		
		helper(detail[3]);
		helper(detail[0]);
	}
	
	public static void dynamic() {
		ArrayList <ObjectAr> detail = new ArrayList <>();
		
		detail.add(new ObjectAr("Ganu", "Commerce", 3, 5.5));
		
		helper(detail.get(0));
	}
	
	public static void helper(ObjectAr stdns) {
		System.out.println(stdns.stdname);
		System.out.println(stdns.depName);
		System.out.println(stdns.yearofstud);
		System.out.println(stdns.cgpa);
	}
	
	public static void main(String[] args) {
		System.out.println("ArrayList of objects");
		dynamic();
		System.out.println("Array of objects");
		normal();
	}
}