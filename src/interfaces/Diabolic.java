package interfaces;

interface Omlander{
	
	void omlander(String name);
}

interface Hughie extends Omlander{
	
	@Override
	public void omlander(String name) ;
	
	void hughie(String name);
	
	void dialougue();
}

public class Diabolic implements Hughie{

	public static void main(String[]args) {
		
		Omlander obj = new Diabolic();
		obj.omlander("homelander");//which one did it called cause used the interface omlander
		Hughie obj1 = new Diabolic();
		obj1.hughie("Ouughie");
		obj1.dialougue();
	}
	@Override
	public void omlander(String name) {
		
		System.out.println(name+" "+"its hte omlander");
	}
	@Override
	public void hughie(String name) {
		
		System.out.println("oii"+" "+name);
	}
	
	@Override
	public void dialougue() {
		
		System.out.println("ducking diabolical");
	}
}

