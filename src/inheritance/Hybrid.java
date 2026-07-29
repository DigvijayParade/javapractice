package inheritance;

class Wolf{
	
	String teeth;
	public Wolf(String teeth) {
		
		this.teeth = teeth;
	}
	void sharpTeeth(){
		
		System.out.println("got some"+" "+teeth);
	}
	void fluffy() {
		
		System.out.println("wolfs are fluffy");
	}
}
	interface Dawg{
		
		default void germanShephard() {
			
			System.out.println("this dog aint human");
		}
		void goodBoy() ;
	}


public class Hybrid extends Wolf implements Dawg{

	Hybrid(String teeth){
		super(teeth);
		
	}
	public static void main(String[] args) {
		
		Hybrid obj = new Hybrid("big teeth");
		obj.fluffy();
		obj.germanShephard();
		obj.goodBoy();
		
	}
	@Override
	void fluffy() {
		
		System.out.println("hybrid dog is fluffy too");
		
		sharpTeeth();
		super.fluffy();
	}
	@Override
	public void germanShephard() {
		
		System.out.println("this dog aint human");
		System.out.println("its germanshephard");
		Dawg.super.germanShephard();
	}
	@Override
	public void goodBoy() {
		
		System.out.println("he is a goodboy");
		
		
	}
}
