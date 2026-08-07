package abstractclasses;

class Samsung extends Android {
	public Samsung(String brandName, int brandid) {
		super(brandName, brandid);
	}
}

class ApplePhone extends Iphone {
	public ApplePhone(String brandName, int brandid) {
		super(brandName, brandid);
	}
}

public class User {

	public static void main(String[] args) {

		Mobile m1 = new Samsung("Samsung", 101);
		m1.charge(5);
		m1.call(true);
		m1.playGames();

		Mobile m2 = new ApplePhone("Apple", 102);
		m2.charge(85);
		m2.call(false);
		m2.playGames();
	}
}