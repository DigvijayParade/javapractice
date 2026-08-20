package pojo_classes;

public class CarData {

	public void getData(Pojo1 p) {
		
		p.setName("Lambo");
		p.setID(85);
		p.setPrice(8000000000.45);
		p.setcarEmail("some.gmail.com");
		
		System.out.println(p.getName());
		System.out.println(p.getCarEmail());
		System.out.println(p.getprice());
		System.out.println(p.gerID());
		
	}
	
	public static void main(String[] args) {
		
		Pojo1 obj = new Pojo1();
		
		obj.sendData();
	}
}
