package functionalInterfacess;

public class EmpOperations {

	public static void main(String[] args) {
		
		EmpOp e1 = (Employee emp) -> {
			
			System.out.println(emp.getEmpName());
			System.out.println(emp.getEmpId());
			
			return "Employee Details Added ...";
		};
		
		EmpOp delete = (Employee emp) -> {
			
			emp.setEmpName(null);
			emp.setEmpId(0);
			
			return "Deleted Employee Data ........";
		};

		Employee obj = new Employee("Sonu",78);
		System.out.println(e1.apply(obj));
		System.out.println(delete.apply(obj));
	}
	
}