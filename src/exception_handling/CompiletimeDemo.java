package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompiletimeDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream obj = new FileInputStream("C.//info.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();does thi prints the error
			System.out.println("aint no file like that");
		}
	}
}
