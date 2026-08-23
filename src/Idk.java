
public class Idk {

	int a ;
	int b ;
	
	public Idk(int a ,int b) {
		
		this.a = a ;
		this.b = b ;
		
	}
	
	public static void main(String[] args) {
		
		Idk [] what = new Idk[5] ;
		
		what[0] = new Idk(12,78);
		what[1] = new Idk(48,49);
		what[2] = new Idk(69,78);
		what[3] = new Idk(96,48);
		what[4] = new Idk(89,37);
		
		for(Idk o : what) {
			
			o.m1();
			
		}
		
	}
	
	void m1() {
		
		System.out.println(a - b);
	}
}
