package polymorphism ;

class CombatEngine{
	
	String monsterName ;
	int Health ;
	boolean isAttacked ;
	
	public CombatEngine(String monsterName, int Health ,boolean isAttacked) {
		
		this.monsterName = monsterName ;
		this.Health = Health ;
		this.isAttacked = isAttacked ;
		
	}
	
	CombatEngine attack(String mName) {
		
		if (isAttacked) {
			
			this.Health -= 40;
			System.out.println("Monster Was Attacked now Health of it is "+this.Health);
		}
		
		else {
			
			System.out.println(this.monsterName+" "+"Escaped !!");
		}
		return this ;
		
	}
	
	CombatEngine attack(int damage) {
		
		System.out.println("Special attack used ");
		
		this.Health -= damage ;
		
		System.out.println();
		System.out.println("Monster Was Attacked now Health of it is "+this.Health);
		
		return this ;
		
	}
}

public class CompileTime{
	
	//compile time means overloading
	public static void main(String[] args) {
		
		CombatEngine Nanu = new CombatEngine("Thanos",1000,true);
		
		Nanu.attack("Thanos").attack(100);
		
	}
	
}