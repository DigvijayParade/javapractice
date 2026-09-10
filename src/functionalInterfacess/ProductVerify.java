package functionalInterfacess;

import java.util.function.*;

public class ProductVerify {

	public static void main(String[] args) {
		
		ProductInfo p1 = new ProductInfo("Iphone",101,90000.00,false);
		ProductInfo p2 = new ProductInfo("Samsung",102,80000.00,true);
		ProductInfo p3 = new ProductInfo("RedMi",103,9000.00,false);
		ProductInfo p4 = new ProductInfo("Redmagic",104,190000.00,false);
		ProductInfo p5 = new ProductInfo("Pixel",105,95000.00,true);
		
		Function <ProductInfo,String>getname = (pd) -> {return pd.getPdname();};
		Predicate <ProductInfo> isExpired = (pd) -> pd.isExpired();
		Consumer<ProductInfo> takePd = pd -> System.out.println("Processing: " + pd.getPdname());
		Supplier <ProductInfo> givePd = () -> new ProductInfo("Nokia",106,100000000.00,false);
		
		System.out.println(getname.apply(p3));
		boolean expireTestonp1 = isExpired.test(p1);
		System.out.println(expireTestonp1);
		takePd.accept(p5);
		System.out.println(givePd.get());
		
		ProductVerify obj = new ProductVerify();
		obj.m1(expireTestonp1);
	}
	
	void m1(boolean yesOrno ) {
		
		if (yesOrno) {
			
			System.out.println("Product Expired ? : "+ yesOrno);
		}else {
			
			System.out.println("Product isnt Expired.....");
		}
	}
}
