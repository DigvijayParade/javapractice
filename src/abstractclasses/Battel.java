package abstractclasses;

public class Battel {

	public static void main(String[] args) {
		
		Combatant w1 = new Warrior("Sukuna",1000,2000);
		
		w1.attack("Gojo");
		w1.defend();
		w1.usespecialability();
	}
}
