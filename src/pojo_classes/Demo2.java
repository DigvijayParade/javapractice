package pojo_classes;

public class Demo2 {

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		
		obj.setName("Nanu");
		obj.setId(38);
		
		DemoClass obj1 = new DemoClass();
		
		obj1.setName("Ganu");
		obj1.setId(102);
		
		DemoClass obj2 = new DemoClass();
		obj2.setName("Nanu");
		obj2.setId(38);
		
		DemoClass [] list = new DemoClass[3];
		
		list[0] = obj ;
		list[1] = obj1 ;
		list[2] = obj2 ;
		
		for(DemoClass info : list) {
			
			System.out.println(info);
			System.out.println(info.hashCode());
			System.out.println(info.equals(obj));
		}
	}
}
