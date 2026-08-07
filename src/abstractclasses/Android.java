package abstractclasses;

public abstract class Android implements Mobile {

	String brandName;
	int brandid;

	public Android(String brandName, int brandid) {
		this.brandName = brandName;
		this.brandid = brandid;
	}

	@Override
	public void playGames() {
		System.out.println("Playing Games on Android");
	}
}