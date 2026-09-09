package functionalInterfacess;

import java.util.function.Function;

public class SetDataBclass {

	public static void main(String[] args) {
		
		DataB s1 = new DataB("Nanu",101);
		DataB s2 = new DataB("Sonu",102);
		DataB s3 = new DataB("Monu",103);
		
		Function <DataB,Integer> f1 = (d) ->(d.getId());
		
		System.out.println(f1.apply(s3));
	}
}
