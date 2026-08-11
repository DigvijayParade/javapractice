package keywords.this_super_final;

import java.util.*;

interface Ability{
	
	void usespecialMove();
}

abstract class Hero implements Ability{
	
	String name ;
	int health ;
	int attackpower;

	public Hero(String name ,int health ,int attackpower) {
		
		this.name = name ;
		this.health = health ;
		this.attackpower = attackpower ;
	}
	
	public Hero(String name ,int health ) {
		
		this(name , health,50);
		
	}
	
	public void takeDamage(int damage) {
		
		this.health -= damage ;
		System.out.println("took Damge of "+damage+" health is now"+" "+health);
	}
	
	public abstract void speak() ;
	
}

class Warrior extends Hero{

	public Warrior(String name, int health) {
		
		super(name, health);

	}
	
	@Override
	public void speak() {
		
		System.out.println(name+" "+"has "+health+" "+" health and "+attackpower+" "+"AttackPower");
		System.out.println("Randoom bullcrap go !!");
	}
	
	@Override
	public void usespecialMove() {
		
		System.out.println("this nigga "+name+" "+"uses special move");
	}
	
}

class Mage extends Hero{
	
	public Mage(String name ,int health ) {
		
		super(name ,health );
	}
	
	@Override
	
	
	
	
}

public class Driver {

}
