package stream_api;

public class Main {

	public static void main(String[] args) {
		
		Converter m1 = e -> {return e.toUpperCase() ;};
		
		System.out.println(m1.converTouppercase("nanu"));
		
		Converter m2 = String::toUpperCase;
		
		System.out.println(m2.converTouppercase("nanu"));
		
	}
}
