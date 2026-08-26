package functionalInterfacess;

public class EmpOperations {

	public static void main(String[] args) {
		
		EmpOp e1 = (Employee emp) -> {return "Details of";};

		Employee []empList = new Employee[3];
		empList[0] = new Employee("Nanu",101);
		empList[1] = new Employee("Gannu",102);
		empList[2] = new Employee("Sonu",103);
		
		//////////
		for (Employee e : empList) {
			
			System.out.println(e);
		}
	}
	
}