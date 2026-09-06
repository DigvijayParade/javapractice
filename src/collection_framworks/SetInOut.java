package collection_framworks;

import java.util.HashSet;
import java.util.Set;

public class SetInOut {
    public static void main(String[] args) {
        
        Set<StudentData> stdData = new HashSet<>();

        StudentData s1 = new StudentData("Nanu", 101);
        StudentData s2 = new StudentData("Swara", 102);
        StudentData s3 = new StudentData("annu", 101);

        stdData.add(s1); 
        stdData.add(s2); 
        stdData.add(s3); 

        System.out.println("Size: " + stdData); 
        System.out.println(stdData.remove(s3));
        
        System.out.println(stdData);
    }
}