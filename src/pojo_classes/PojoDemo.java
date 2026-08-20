package pojo_classes;

public class PojoDemo {

	private String name ;
	private int id ;
	private String address ;
	
	public PojoDemo(String name,int id ) {
		
		if(!(name == null)) {
			
		this.name = name ;
		
		}
		
		if(id > 0 && ){}
		this.id = id ;

	}
	
	public void setAddress(String address) {
		
		if(!(address == null)) {
			
			this.address = address ;
		}
		else {
			
			System.out.println("the address should be filled !!");
		}
	}
	
	public String getAddress() {
		
		return this.address ;
	}
}
