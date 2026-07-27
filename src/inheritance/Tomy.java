package inheritance;

class Animal {

	void makeNoise() {
		System.out.println("Animal makes noise");
	}
}

class Dog extends Animal {

	void makeNoise() {
		System.out.println("Dog barks");
	}

	void eat() {
		System.out.println("Dog eats food");
	}
}

public class Tomy extends Dog {

	public static void main(String[] args) {

		Tomy toy = new Tomy();
		toy.eat();//method reuse without overriding
		toy.makeNoise();//overriden method
	}

	void makeNoise() {
		System.out.println("Tommy barks loudly");
	}
}