package lambdas;

public class Maintain {

	public static void main(String[] args) {
		
		TaxCalculator flatTax = s -> (s* 0.10);
		
		TaxCalculator tieredTax = s -> {double amount = 0.0 ;
		
							if(s >= 50000.00) {
			
								amount = s* 0.20 ;
							}else {
								
								amount = s*0.10 ;
							}
					return amount ;		
		};
		
		System.out.println(flatTax.calculate(65000.00));
		System.out.println(tieredTax.calculate(65000.00));
	}
}
