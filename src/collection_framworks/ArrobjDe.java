package collection_framworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrobjDe {

	String name ;
	int id ;
	
	public ArrobjDe(String name,int id) {
		
		this.name = name ;
		this.id = id ;
	}
	
	public static void main(String[] args) {
		
		ArrayList <ArrobjDe> info = new ArrayList <>();
		
		info.add(new ArrobjDe("Nanu", 101));
		info.add(new ArrobjDe("Sonu", 102));
		info.add(new ArrobjDe("Monu", 103));
		info.add(new ArrobjDe("Ganu", 104));
		info.add(new ArrobjDe("Nanu", 101));
		
		System.out.println("-----------OG list ------------");
		for(ArrobjDe o : info) {
			
			System.out.println(o);
		}
		
		Iterator <ArrobjDe> it = info.iterator();
		
		while(it.hasNext()) {
			
			ArrobjDe e = it.next();
			if(e.name.equals("Nanu")) {
				
				it.remove();
				break;
			}
			
		}
		
		
		System.out.println("----------New List ----------");
		
			for(ArrobjDe o : info) {
			
			System.out.println(o);
		}
			
			System.out.println(info.size());

		
	}
	
	@Override
	public String toString() {
		
		return "Name : "+name+"||"+"ID : "+id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrobjDe other = (ArrobjDe) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
