package functionalInterfacess;

@FunctionalInterface
public interface Data {

	String name = null;
	int id = 0 ;
	
	void setData(String name, int id);
	
	default void purpose() {System.out.println("this is the Fucntional Interface");};
}
