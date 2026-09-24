package method_reference;

public class Mr {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Nanu",101,"Male");
		
		Valid vd = Employee :: validateEmpDetails ;
		
	vd.validate(emp);
		
		Valid vd2 = e -> e.getGender().equalsIgnoreCase("Male");
		
		vd2.validate(emp);
	}
}
