package collection_framworks;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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
        
        Set<StudentData> set = new TreeSet<>(Comparator.comparingInt(StudentData::getId));
        set.addAll(Set.of(new StudentData("Gannu", 105), new StudentData("mannu", 106)));
        
        try {
        for (StudentData o : set) {
        	
        		System.out.println(o);
        }
        }
        catch(Exception e) {
        	
        	System.out.println(e.getMessage());
        }
    }
}