package lambdas;

import java.util.Optional;
import java.util.function.*;

public class MainT {
	
	public static void main(String[] args) {
		
		Function<Data,String> getSome = o -> o.getName();
		Predicate<Data> fil = o -> o.getSalary() > 20000.00 ;
		Consumer<Data> updateSal = o -> o.setSalary(1000000000);
		Supplier <Data> supplyData = () -> new Data("Nanu",101,45000.20);
		
		Data d1 = new Data("Gannu",102,30000.22);
		Data d2 = new Data();
		
		System.out.println(getSome.apply(d1));
		System.out.println(fil.test(d1));
		updateSal.accept(d1);
		System.out.println(supplyData.get());
		
		System.out.println("Null bject");
		
		System.out.println(getSome.apply(d2));
		System.out.println(fil.test(d2));
		updateSal.accept(d2);
		System.out.println(supplyData.get());
		
		System.out.println(d1);
		
		checkName(d1);
		checkName(d2);
	}
	
	public static void checkName(Data d) {
		
		String name = Optional.ofNullable(d)
						.map(Data::getName)
						.orElse("Invalid");
		
		System.out.println(name);
	}

}
