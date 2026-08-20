package pojo_classes;

public class PojoDemo {

	private String name ;
	private int id ;
	private String address ;
	
	public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
	public void setID(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
	public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        }
    }
	
	public String getName() {
		
		return this.name ;
	}
	
	public int getID() {
		
		return this.id ;
	}
	
	public String getAddress() {
		
		return this.address ;
	}
}
