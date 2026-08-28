
import java.io.*;

public class Files {

	public static void main(String[] args) {
		
		try {
			File folder = new File("D:\\");
			
			File[] filesArray = folder.listFiles();
			if (filesArray != null) {
                for (File n : filesArray) {
                    System.out.println(n.getName()); 
                }
            } else {
                System.out.println("The path does not exist or is not a directory.");
            }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
