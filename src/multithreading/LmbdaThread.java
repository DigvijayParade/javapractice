package multithreading;

public class LmbdaThread {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> {
		
				for(int i = 0 ; i <= 100/2 ; i++) {
					
					System.out.println(i);
				}});
		
		t.start();
		
		
	}
}
