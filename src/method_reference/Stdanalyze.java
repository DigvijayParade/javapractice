package method_reference;

public class Stdanalyze {

	public static void main(String[] args) {
		
		Stdopr m1 = Students :: validateStd ;
		
		Students s1 = new Students("Nanu",11,"MCA");
		
		m1.opr(s1);
	}
}
