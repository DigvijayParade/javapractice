package lambdas ;

import java.util.function.*;

public class Main{
	
	public static void main(String[] args) {
		
		Data o1 = new Data("Nanu",101,40000.00);
		
		Function<Data,String> idDetails = o -> {return "Name : "+o.getName()+"||"+"Salary : "+o.getSalary();};
		Predicate <Data> isit = o -> o.getSalary() > 20000;
		Consumer<Data> cons = o -> o.setName("Fendry");
		Supplier <Double> give = ()->  Math.random();
		
		System.out.println(idDetails.apply(o1));
		System.out.println(isit.test(o1));
		cons.accept(o1);
		System.out.println(o1);
		System.out.println(give);
		
		
	}
}