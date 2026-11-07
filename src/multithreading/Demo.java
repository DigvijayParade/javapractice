package multithreading;

public class Demo extends Thread{

	@Override
	public void run() {
			
		for(int i = 0 ; i < 100 ; i++)
		System.out.println("Thread 1st : "+ i);
	}

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		
		d1.start();
		d2.run();
		
	}
}
