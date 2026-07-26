package array;
public class Ok{

String name ;
int id ;
    public Ok(String name,int id){

        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        
        Ok[] data = new Ok[5];
        data [0]= show(new Ok("Nanu",39));

    }public static Ok show(Ok std){

        System.out.println(std.name);
        System.out.println(std.id);
        return std;

    }

}