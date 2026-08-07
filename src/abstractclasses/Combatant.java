package abstractclasses;

public interface Combatant {
	
	void attack(String target);
	void defend();
	void usespecialability();

}

abstract class GameCharacter implements Combatant{
	
	String name ;
	int health ;
	
	public GameCharacter(String name ,int health) {
		
		this.name = name ;
		this. health = health ;
		
	}
}

abstract class Hero extends GameCharacter{
	
	int stamina ;
	
	public Hero(String name ,int health,int stamina) {
		
		super(name , health);
		this.stamina = stamina ;
		
	}
	
}

class Warrior extends Hero{
	
	public Warrior(String name ,int health,int stamina) {
		
		super(name , health , stamina);
		System.out.println("Hero Warriors Name : "+name);
		System.out.println(name+"'s"+" "+health);
		System.out.println(name+"'s"+" "+stamina);
	}
	
	@Override 
	public void attack(String target) {
		
		System.out.println("Hero attacks "+" "+target);
	}
	
	@Override
	public void defend() {
		
		System.out.println(name+" "+"Defends from the attack");
	}
	
	@Override
	public void usespecialability() {
		
		System.out.println("Hero"+" "+name+" "+"uses Special Ability!!");
	}
}
