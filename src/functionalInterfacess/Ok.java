package functionalInterfacess;

public class Ok {

	Some e = (String greet) -> {
		
		System.out.println(greet);
	};
	
	public static void main(String[] args) {
		
		Ok o = new Ok();
		o.e.hello("Whats up");
	}
}
