package functionalInterfacess;

import java.util.function.*;

public class SetDataBclass {

	public static void main(String[] args) {
		
		DataB s1 = new DataB("Nanu",101);
		DataB s2 = new DataB("Sonu",102);
		DataB s3 = new DataB("Monu",103);
		
		Function <DataB,Integer> f1 = (d) ->(d.getId());
		Predicate <DataB> f2 = (d) -> (d.getName() == "Nanu");
		Consumer <DataB> f3 = (d) -> System.out.println(new StringBuilder(d.getName()).reverse().toString());
		Supplier<DataB> f4 = () -> new DataB("Durgesh", 10000);
		
		System.out.println(f1.apply(s3));
		System.out.println(f2.test(s1));  
		f3.accept(s1);                   
		
		DataB newObj = f4.get();
		System.out.println(newObj);
	}
}
