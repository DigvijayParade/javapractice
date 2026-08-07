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
		
		System.out.println("Character Name : "+name);
		System.out.println(name+"'s"+" "+health);
	}
}

abstract class Hero extends GameCharacter{
	
	int stamina ;
	
	public Hero(String name ,int health,int stamina) {
		
		super(name , health);
		this.stamina = stamina ;
		
		System.out.println("Hero Name : "+name);
		System.out.println(name+"'s"+" "+health);
		System.out.println(name+"'s"+" "+stamina);
		
	}
}
