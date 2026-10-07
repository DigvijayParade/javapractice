package constructor;


import java.util.*;

public class Constchain {
	
	int maths ;
	int science ;
	String name;
	
	public Constchain(int maths,int science){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		this(sc.nextLine());
		System.out.println("Enter your Maths marks : ");
		maths = sc.nextInt();
		System.out.println("Enter your Science marks : ");
		science = sc.nextInt();
		System.out.println(name+" "+"got total marks : "+" "+(maths+science));
	}
	
	
	public static void main(String[]args) {
	Constchain s1 = new Constchain(0,0);
	
	s1.subList().subMarks();
	
	}
	public Constchain subMarks() {
		
		int[] marks = new int[5];
		System.out.println("Enter your 5 subject marks out of 100 : ");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < marks.length; i++) {
			
			marks[i] = sc.nextInt();
		}
		System.out.println("Marks for all the subjects : "+" "+Arrays.toString(marks));
		
		return this;
	}
	public Constchain subList() {
		
		ArrayList <String> subjects = new ArrayList<>();
		
		System.out.println("Enter your 5 subject Names : ");
		Scanner sc = new Scanner(System.in);
		subjects.add(sc.nextLine());
		subjects.add(sc.nextLine());
		subjects.add(sc.nextLine());
		subjects.add(sc.nextLine());
		subjects.add(sc.nextLine());
		
		System.out.println("All subjects List : "+" "+subjects);
		
		return this;
	}

}
