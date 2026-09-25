package method_reference;

public class Stdanalyze {

	public static void main(String[] args) {
		
//		Stdopr m1 = Students :: validateStd ;
		Stdopr m2 = Students :: meth ;
		
		Students s1 = new Students("Nanu",11,"MCA");
		
//		m1.opr(s1);
		System.out.println(m2.opr(s1));
	}
}
