package constructor;

import java.util.*;

public class Idk{
	
	String name;
	int age;
	public Idk(String name,int age) {
		
		this.age = age;
		this.name = name;
	}
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and age : ");
		String nav = sc.nextLine();
		int vay = sc.nextInt();
		
		Idk obj = new Idk(nav,vay);
		obj.info();
		
	}
	public void info() {
		
		System.out.print("name : "+" "+this.name+" "+" | age : "+" "+this.age);
	}
}