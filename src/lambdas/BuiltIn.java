package lambdas;

import java.util.function.*;

public class BuiltIn {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = x -> {if(x%2 == 0) 
		
											{return true; }
			
												else {return false;}
		
		
		};
		
		Consumer<String> to = s -> System.out.println(s.toUpperCase()); 
		
		Function<String,Integer> lengt = s -> s.length();
		
		Supplier<Double> rand = () -> Math.random();
		
		System.out.println(isEven.test(59));
		
		to.accept("nanu");
		
		System.out.println(lengt.apply("Something is wrong"));
		
		System.out.println(rand.get());
		
		
	}
}
