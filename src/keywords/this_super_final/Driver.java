package keywords.this_super_final;

import java.util.*;

interface Ability {
	
	Hero usespecialMove();
}

abstract class Hero implements Ability {
	
	String name;
	int health;
	int attackpower;

	public Hero(String name, int health, int attackpower) {
		this.name = name;
		this.health = health;
		this.attackpower = attackpower;
	}
	
	public Hero(String name, int health) {
		this(name, health, 50);
	}
	
	public Hero takeDamage(int damage) {
		this.health -= damage;
		System.out.println("took Damge of " + damage + " health is now " + health);
		return this;
	}
	
	public abstract Hero speak();
	
	public abstract Hero usespecialMove();
}

class Warrior extends Hero {

	public Warrior(String name, int health) {
		super(name, health);
	}
	
	@Override
	public Warrior speak() {
		System.out.println(name + " " + "has " + health + " " + " health and " + attackpower + " " + "AttackPower");
		System.out.println("Randoom bullcrap go !!");
		return this;
	}
	
	@Override
	public Warrior usespecialMove() {
		System.out.println("this nigga " + name + " " + "uses special move");
		return this;
	}
}

class Mage extends Hero {
	
	public Mage(String name, int health) {
		super(name, health);
	}
	
	@Override
	public Mage speak() {
		System.out.println("Death can have me when it earns me !!");
		return this;
	}
	
	// CHANGE 2: Return type changed from 'void' to 'Mage' and added 'return this;'
	@Override
	public Mage usespecialMove() {
		System.out.println("this mage is using speacial move");
		return this;
	}
}

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Hero> lst = new ArrayList<>();
		
		lst.add(new Warrior("Dr.Doom", 1000));
		lst.add(new Mage("Dr.Strange", 500));
		
		for (Hero h : lst) {
			h.speak().usespecialMove().takeDamage(100);
			System.out.println("------------------------------------");
		}
	}
}