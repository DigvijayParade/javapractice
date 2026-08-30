package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExc {

    static void m1() throws FileNotFoundException {
        try {
            FileInputStream obj = new FileInputStream("C://info.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Log: File open failed in m1(). Re-throwing exception...");
            throw e; 
        }
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}