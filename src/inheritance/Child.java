package inheritance;

interface Mother{
	
	void color();
	default void hairs() {
		
		System.out.println("black long hairs");
	}
}

interface Father{
	
	void color ();
	default void hairs() {
		
		System.out.println("dady bald af!!");
	}
	
}

public class Child implements Mother,Father{
	
	@Override
	public void hairs() {
		
		Mother.super.hairs();
		
	}
	@Override 
	public void color() {
		
		System.out.println("color is white");
	}
	public static void main(String[] args) {
		
		Child st = new Child();
		st.hairs();
		st.color();
		
	}
	

}
