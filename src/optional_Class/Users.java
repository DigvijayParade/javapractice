package optional_Class;


class Addresss{
	
	private String city ;
	
	public Addresss(String city) {
		
		this.city = city ;
	}
	
	public String getCity () {
		
		return city ;
	}
}

public class Users {

	private Addresss a ;
	public Users(Addresss a) {
		
		this.a = a;
	}
	
	public Addresss getAddress() {
		
		return a ;
	}
}
