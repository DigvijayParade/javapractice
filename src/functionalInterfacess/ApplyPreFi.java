package functionalInterfacess;

import java.util.function.*;

public class ApplyPreFi {

	public static void main(String[] args) {
		
		Function<DataSet,String> getId = (e) -> e.getDname();
		Predicate <DataSet> checkName = (e) -> e.getDname().equalsIgnoreCase("Nanu");
		Consumer<DataSet> storeObj = (e) -> System.out.println("Consuming: " + e.getDname());
		Supplier<DataSet> supplyObj = () -> new DataSet("Ganu", 101);
		
		
//		getId.apply();
	}
}
