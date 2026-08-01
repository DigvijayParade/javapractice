public class ReverseStringAndArray {

	public static void main(String[] args) {
		
		String[] names = {"nanu", "Gannu", "sonu", "monu"};
		
		reve("VIjay");
		reveArray(names);
		
	}

	public static void reve(String name) {
		
		String reversed = "";  
		 
		for (int i = name.length() - 1; i >= 0; i--) {
			reversed = reversed + name.charAt(i);
		}
		
		System.out.println(reversed);
	}
	
	public static void reveArray(String[] names) {
		
		int start = 0;
		int end = names.length - 1;

		while(start < end) {
			String temp = names[start];
			names[start] = names[end];
			names[end] = temp;
			
			start++;
			end--;
		}

		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
	}
}