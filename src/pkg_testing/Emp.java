package pkg_testing;


public class Emp {

	static String compname = "Apple";
	
	public static void main(String[]args) {
		
		Emp emp1 = new Emp();
		companyName("Microsoft");
		emp1.empName("Digvijay","Parade");
		emp1.empId(101);
		System.out.println(emp1.empLang("Java"));
		
		//
	}
	
	public static void companyName(String compname) {
		
		System.out.println(compname);
		
	}
	
	public void empName(String fsname,String lname) {
		
		System.out.println(fsname+" "+lname);
		
	}
	
	public void empId(int id) {
		
		System.out.println(id);
		
	}
	
	public String empLang(String lang) {
		
		return lang;
		
	}
}
