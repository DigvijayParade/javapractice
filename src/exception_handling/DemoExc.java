package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class DemoExc {

	static void m1() throws FileNotFoundException {
		
		FileInputStream obj = new FileInputStream("C://info.txt");
	}
	public static void main(String[] args) {
		
		
	}
}
