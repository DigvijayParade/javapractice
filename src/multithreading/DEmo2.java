package multithreading;

public class DEmo2 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0 ; i <= 100 ; i++) {
			
			System.out.println("Thread : "+i);
		}
		
	}
	public static void main(String[] args) {
		
		DEmo2 d = new DEmo2();
		DEmo2 d1 = new DEmo2();
		
		Thread t = new Thread(d);
		
		t.start();
		d1.run();
	}

}
