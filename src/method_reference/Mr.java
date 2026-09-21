package method_reference;

public class Mr {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Nanu",101,"Male");
		
		Valid vd = Employee :: validateEmpDetails ;
		
		System.out.println(vd.validate(emp));
		
		Valid vd2 = e -> e.getGender().equalsIgnoreCase("Male");
		
		System.out.println(vd2.validate(emp));
	}
}
