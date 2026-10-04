package functionalInterfacess;

import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		Function <RandomData ,String>gettingName = e -> e.getName() ;
		Predicate <RandomData > findNanu = e -> e.getName().equals("Nanu");
		Consumer <RandomData> store = e -> new RandomData();
		Supplier <RandomData> supply = e 
		
		RandomData obj1 = new RandomData("Nanu ",101,"Male");
		
		System.out.println(gettingName.apply(obj1));
		System.out.println(findNanu.test(obj1));
	}
	
}
