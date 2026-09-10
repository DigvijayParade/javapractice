package functionalInterfacess;

import java.util.Random;
import java.util.UUID;
import java.util.function.*;

public class SetDataBclass {

	public static void main(String[] args) {
		
		DataB s1 = new DataB("Nanu",101);
		DataB s2 = new DataB("Sonu",102);
		DataB s3 = new DataB("Monu",103);
		
		Function <DataB,Integer> getId = obj -> obj.getId();
		Predicate <DataB> checkName = obj -> obj.getName().equals("nanu");
		Consumer <DataB> storeObj = obj ->{ System.out.println(  obj.getName());};
		Supplier <DataB> giveObj = () -> new DataB("Gannu",104);
		Supplier<String> giveStr = () -> UUID.randomUUID().toString();
		
		System.out.println(getId.apply(s3));
		System.out.println(checkName.test(s3));
							storeObj.accept(s3);
		System.out.println(giveObj.get());
		System.out.println(giveStr.get());
	}
}
