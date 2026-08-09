package keywords.this_super_final;

//using this keyword
class Lock{
	
	String name ;
	int id ;
	public Lock(String name) {
		
		//use case 1 (const chaining)
		this(101);
		//use case 2 (variables pov)
		this.name = name ;
		System.out.println(name);
		
	}
	
	public Lock(int id) {
		
		this.id = id ;
		System.out.println(id);
	}
	
	//final key use
	public final Lock greet() {
		
		System.out.println("Hello");
		
		return this ;
	}
	
	public Lock time() {
		
		System.out.println("im out of time , i have to hurry");
		
		return this ;
	}
	
	public static void main(String[] args) {
		
		Lock obj = new Lock(999);
		obj.greet().time();
		
		Lock obj2 = new Lock("Nanu");
		obj.time().greet();
	}

	
}

public class KeyDemo extends Lock{

	public KeyDemo(String name , int id) {
		
		super(name );
	}
	
	public static void main(String[] args) {
		
		KeyDemo obj = new KeyDemo("Janu",102);
		obj.greet().time();
	}
	
	@Override 
	public Lock time(){
		
		System.out.println("Override the this metjhod cause it aint final but the greet method is final can overrde that");
		return this ;
	}
}
