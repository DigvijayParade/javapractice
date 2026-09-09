package functionalInterfacess;

import java.util.function.*;

public class PreDefinedFunction {
	
	public static void main(String[] args) {
		
		Function  <String,Integer> f1 = (str) ->  str.length();
		
		Function <Integer,String> f2 = (num) -> {
			
			if(num > 10) {
				
				return "this aint no less than 10";
			}else {
				
				return "this smaller than 10";
			}
		};
		
		System.out.println(f1.apply("nanu"));
		
		System.out.println(f2.apply(4));
	}

}
