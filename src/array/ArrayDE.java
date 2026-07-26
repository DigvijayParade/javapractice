package array;

import java.util.*;

public class ArrayDE{
	
	public static void main(String[]args) {
		
		String [] names = {"Nanu","sonu","monu"};
		int [] id = new int[5];
		ArrayList <Integer> numbers = new ArrayList<>();
		
		System.out.println(names[2]);
		id[4] = 38;
		id[0]= 67;
		numbers .add(23);
		numbers .add(289);
		System.out.println(numbers);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(id));
		
		System.out.println(id[4] + id[0]);
		System.out.println(numbers.get(0)+numbers.get(1));
		
		Scanner sc = new Scanner(System.in);
		id[3] = sc.nextInt();
		System.out.println(id[3]);
		System.out.println(Arrays.toString(id));
		numbers.add(sc.nextInt());
		System.out.println(numbers);
		sc.close();
		
		Double price = Double.valueOf(45.25);
		double v = price;
	}
}