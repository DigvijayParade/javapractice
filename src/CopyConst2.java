
public class CopyConst2 {

	String name ;
	public CopyConst2(String name) {
		
		this.name = name ;
	}
	
	public CopyConst2(CopyConst2 h) {
		
		this.name = h.name ;
	}
	
	public static void main(String[] args) {
		
		CopyConst2 obj = new CopyConst2("nanu");
		CopyConst2 obj1 = new CopyConst2(obj);
		
		obj1.name = "Ganu";
	}
}
