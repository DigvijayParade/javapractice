package pojo_classes;

public class StudentData {

	public static void main(String[] args) {
		
		 SetStd [] stdInfo = new SetStd[4];
		
		stdInfo [0] = new SetStd("Nanu Parde",101,96.00);
		stdInfo [1] = new SetStd("Ganu",102,90.00);
		stdInfo [2] = new SetStd("Sonu",103,58.00);
		stdInfo [3] = new SetStd("Pandu",104,17.00);
		
		for(SetStd obj : stdInfo) {
			
//			obj.setName(null);
//			obj.setId(0);
//			obj.setPer(0);
			
			System.out.println(obj);
		}
	}
}
