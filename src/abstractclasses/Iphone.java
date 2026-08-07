package abstractclasses;

public abstract class Iphone implements Mobile {

	String brandName;
	int brandid;

	public Iphone(String brandName, int brandid) {
		this.brandName = brandName;
		this.brandid = brandid;
	}

	@Override
	public void playGames() {
		System.out.println("Playing Games on iPhone");
	}
}