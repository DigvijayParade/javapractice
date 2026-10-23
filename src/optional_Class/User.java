package optional_Class;

class Address{
	
	private String city ;
	
	public Address(String city) {
		
		this.city = city ;
		
	}
	public String getCity() {
		
		return city ;
	}
}

public class User {

	private Address address ;
	
	public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
