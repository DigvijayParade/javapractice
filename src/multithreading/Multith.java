package multithreading;

public class Multith implements Runnable{

	public static void main(String[] args) {
		
		Multith sm = new Multith();
		
		Thread t = new Thread(sm);
		
		t.run();
		t.start();
		
		
	}
	
	@Override
	public void run() {
		
		for(int i = 0 ; i <= 1000 ; i++) {
			
			System.out.println("Threa : "+i);
		}
	}
}
