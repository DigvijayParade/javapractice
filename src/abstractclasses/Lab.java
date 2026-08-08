package abstractclasses;

import java.util.*;

interface Actions{
	
	void sit() ;
	void stand();
	void go();
	
}

abstract class Student implements Actions{
	
	String name ;
	String gen ;
	int rollNo ;
	public Student(String name ,String gen , int rollNo) {
		
		this.name = name ;
		this.gen = gen ;
		this.rollNo = rollNo ;
		
		System.out.println("Name of the Students : "+name);
		System.out.println("Gender of the Student : "+gen);
		System.out.println("Roll No. : "+rollNo);
	}
	@Override
	public void sit() {
		
		System.out.println(name+" "+"sits in the Lab !!");
	}
	
	@Override 
	public void stand() {
		
		System.out.println(name+" "+"Stands in the Lab");
	}
	
	@Override
	public void go() {
		
		System.out.println(name+" "+"Gooes to Lab !!");
	}
}

class Boys extends Student{

	public Boys(String name ,String gen , int rollNo) {
		
		super(name,gen ,rollNo);
	}
}

class Girls extends Student{
	
	public Girls(String name ,String gen , int rollNo) {
		
		super(name,gen,rollNo);
	}
	
}

public class Lab{
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Name of the Student : ");
//		String name = sc.nextLine();
//		System.out.println("Enter Gender Of the Student : ");
//		String gen = sc.nextLine();
//		System.out.println("Enter Roll no of the Student : ");
//		int roll = sc.nextInt();
		
//		ArrayList <Boys> listStd = new ArrayList<> ();
		
//		listStd.add(new Boys("Vijsy","Gay",66));
		
		ArrayList <Boys> listBoys = new ArrayList<> ();
		
		listBoys.add(new Boys("Vijsy","Gay",66));
		listBoys.add(new Boys("DD","Non- binary",69));
		
		for(Boys h : listBoys) {
			
			h.sit();
			h.stand();
			h.go();
		
		}
		ArrayList <Girls> listGirls = new ArrayList<> ();
		
		listGirls.add(new Girls("Vijsy","Gay",66));
		listGirls.add(new Girls("DD","Non- binary",69));
			
			
			
	
}
	
}
