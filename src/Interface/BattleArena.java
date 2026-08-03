package Interface;

interface Hero{
	
	void attack() ;
	void useSpecialAbility() ;
}

class BaseHero implements Hero{
	
	String name;
	int health;
	
	public BaseHero(String name , int health) {
		
		this.name = name ;
		this.health = health ;
	}
	
	@Override
	public void attack() {
		
		System.out.println(name+" "+"swings a basic weapon for 10 Damage");
	}
	
	@Override
	public void useSpecialAbility() {
		
		System.out.println(name+" "+"use basic hero kills");
	}
}

class Mage extends BaseHero{
	
	int mana = 50;
	
	public Mage(String name , int health){
		
		super(name, health);
	}
	
	@Override 
	public void useSpecialAbility() {
		
		if (mana <= 30) {
			
			mana -= 30;
			System.out.println(name+" "+"casts fireball Remainig mana : "+" "+mana);
		}
		else {
			
			System.out.println(name+" tries to cast Fireball, but doesn't have enough mana!");
		}
	}
}

class Archer extends BaseHero{
	
	int ammo = 2;
	public Archer(String name , int health) {
		
		super(name,health);
	}
	
	@Override
	public void useSpecialAbility() {}
}

public class BattleArena{}