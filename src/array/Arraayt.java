package array;

public class Arraayt {
	
	public static void main(String[]args) {

		ok();
		revPrint();
		
	}public static void ok() {
		
		String [] names = {"n","l","k","f","r"};
		
		for(int i = 0;i <= names.length - 1;i++) {
			
			System.out.println(names[i]);
		}
		
	}
	public static void revPrint() {
		
		String [] noob = {"n","l","k","f","r"};
		
		for (int i = noob.length - 1; i >= 0; i--) {
			
			System.out.println(noob[i]);
		}
	}

}
