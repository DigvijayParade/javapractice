package functionalInterfacess;

public class DataBaseDemo {

	Data n1 = (String name,int id) -> {
		
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
	};
	
	public static void main(String[] args) {
		
		
		DataBaseDemo obj = new DataBaseDemo();
		
		obj.n1.setData("Nanu",101);
	}
}
