package array;

import java.util.*;

public class Metharr {
	
	public static void main(String[] args) {
		
		int[] number = num();
		for(int num : number) {
			System.out.println(num);
		}

		String [] Names = name();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names:");
		for(int i = 0; i < Names.length; i++) {
			Names[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(Names));
		
		ArrayList<Boolean> dare = meth(sc);
		
		System.out.println("--- Booleans entered ---");
		for(boolean how : dare) {
			System.out.println(how);
		}
	}

	public static int[] num() {
		int[] num = {1, 2, 3, 4, 5};
		return num;
	}

	public static String[] name() {
		String[] name = new String[5];
		return name;
	}

	public static ArrayList<Boolean> meth(Scanner sc) {
		ArrayList<Boolean> what = new ArrayList<>();
		
		System.out.print("How many booleans do you want to add? ");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter true or false: ");
			what.add(sc.nextBoolean());
		}
		
		return what;
	}
}