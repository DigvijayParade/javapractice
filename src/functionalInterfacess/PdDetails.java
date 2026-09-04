package functionalInterfacess;

public class PdDetails {

	
	public static void main(String[] args) {
		
//		PdData m1 = (pdId,pdname,num) -> {
//			
//			System.out.println(pdId+" "+pdname);
//		};
//		
//		PdData m2 = (pdname,pdId,num) -> {
//			
//			System.out.println(pdId + num);
//		};
		
		PdData m3 = () -> {
			
			System.out.println("I can do whatever i want no stress of only one time overriding creating diff classes or the implementing the interface");
		};
		
		m3.getPdinfo();
	}
}
