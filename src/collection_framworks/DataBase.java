package collection_framworks;

public class DataBase {

	private String name ;
	private int id ;
	private boolean isMale;
	
	public DataBase(String name,int id,boolean isMale ) {
		
		this.name = name ;
		this.id = id ;
		this.isMale = isMale ;
	}
	public DataBase() {}
	
	public void setName(String s ) {
		
		this.name = s ;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return "Name : " + this.name + ", ID : " + this.id + ", Is Male : " + this.isMale;
	}
	@Override
	public int hashCode(Object o) {
		
		this.getName().equals(o.getName());
	}
}
