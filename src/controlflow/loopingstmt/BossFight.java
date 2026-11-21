package controlflow.loopingstmt;

public class BossFight {
	
	public static void main(String[] args) {
		
		fight(1000, "normal");
		fight(1000, "Critical");
		
	}
	
	
	public static void fight(int bossHealth, String hit) {
		
		while(bossHealth > 0) {
			
			if(hit.equals("Critical")) {
				bossHealth -= 80; 
				System.out.println("Remaining boss health " + bossHealth);
			}
			else {
				bossHealth -= 20; 
				System.out.println("Remaining boss health " + bossHealth);
			}
			
		}
		
	}
}