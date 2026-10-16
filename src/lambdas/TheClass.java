package lambdas;

public class TheClass {

	public static void main(String[] args) {
		
		FiInter into = (x,y) ->{int sqrX = x*x;
		
								int sqrY = y*y;	int total = sqrX + sqrY ;
								System.out.println(total) ;
								
		};
		
		into.multi(10, 20);
	}
}
