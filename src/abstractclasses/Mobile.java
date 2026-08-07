package abstractclasses;

public interface Mobile {

	default void charge(int batterylevel) {
		if (batterylevel > 100 || batterylevel < 0) {
			System.out.println("Battery is damaged");
		}
		else if (batterylevel < 10) {
			System.out.println("Immediately charge the phone");
		}
		else {
			System.out.println("Phone does not need to be charged right now");
		}
	}

	default void call(boolean isCalling) {
		if (isCalling) {
			System.out.println("pickup the phone");
		}
		else {		
			System.out.println("no one is calling");
		}
	}

	void playGames();
}