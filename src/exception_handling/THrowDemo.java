package exception_handling;

import java.io.FileInputStream;

public class THrowDemo {

	static void m1() throws Exception{
		
		FileInputStream file = new FileInputStream("C://info.txt");
		System.out.println(file);
		System.out.println("in the compiletime Exception The throws block is neccessary!!");
	}
	
	static void m2() {
		
		System.out.println("in the runtime Exception The throws block is neccessary!! ");
		int a = 10 ;
		int b = 0 ;
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		m2();//this method contains an runtime exception it isnt neccesaary or reccomended to use the throws for the runtime exception
		
	}

}
