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
		
		BonusCalculator performanceBonus = (bs,pr) -> {double bonus = 0.0 ;
		
		if (pr >= 4.5) {
            return bs * 0.20;
        } else if (pr >= 3.0) {
            return bs * 0.10;
        } else {
            return 0.0;
        }
		};
		
		
		System.out.println(performanceBonus.calculate(80000.00, 4.7));
}
}
