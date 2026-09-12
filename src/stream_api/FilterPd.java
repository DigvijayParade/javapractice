package stream_api;

import java.util.ArrayList;

public class FilterPd {

	public static void main(String[] args) {
		
		FilterPd obj = new FilterPd();
		ArrayList <ProductData> pdList = obj.getPddata();
		
		pdList.stream()
	      .filter(e -> e.getPrice() > 50000.00)
	      .forEach(t -> System.out.println(t.getPdName()));
	}
	public ArrayList<ProductData> getPddata(){
		
		ArrayList <ProductData> pdList = new ArrayList<>();
		
		pdList.add(new ProductData("iPhone", 17, 90000.00));
		pdList.add(new ProductData("Samsung", 12, 65000.00));
		pdList.add(new ProductData("OnePlus", 8, 45000.00));
		pdList.add(new ProductData("Google Pixel", 15, 70000.00));
		pdList.add(new ProductData("Vivo", 20, 30000.00));
		
		
		return pdList ;
	}
}
