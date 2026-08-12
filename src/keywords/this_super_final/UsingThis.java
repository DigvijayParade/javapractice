package keywords.this_super_final;

public class UsingThis {

	String name;
	int id;
	double percentage;

	public UsingThis(String name, int id) {
		// USE 1: Constructor Chaining
		this(75.00);
		
		// USE 2: Variable Shadowing
		this.name = name;
		this.id = id;
	}

	public UsingThis(double percentage) {
		this.percentage = percentage;
	}

	UsingThis m1() {
		System.out.println("Using the method chaining");
		// USE 3: Return Current Object
		return this;
	}

	UsingThis m2() {
		System.out.println("using the method chaining for the 2nd method");
		
		// USE 4: Call Instance Method
		this.m3();
		return this;
	}

	void m3() {
		System.out.println("method calling using this ");
	}

	// 🟢 FIX FOR USE 5 & 6: Triggered from an INSTANCE method where 'this' exists!
	void runOtherClasses() {
		Profile p1 = new Profile();
		p1.getName(this); // USE 5: Passing 'this' to a method

		App a1 = new App(this); // USE 6: Passing 'this' to a constructor
	}

	public static void main(String[] args) {
		UsingThis obj = new UsingThis("Nanu", 38);

		// Method Chaining
		obj.m1().m2().m3();

		// Call the instance method that uses 'this'
		obj.runOtherClasses();
	}
}

class Profile {
	// 🟢 FIX: Expects a UsingThis object as a parameter
	void getName(UsingThis obj) {
		System.out.println("Name : " + obj.name);
		obj.m1().m2().m3();
	}
}

class App {
	// 🟢 FIX: Expects a UsingThis object in constructor
	public App(UsingThis obj) {
		System.out.println("App created for: " + obj.name + " (ID: " + obj.id + ")");
	}
}