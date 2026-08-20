package pojo_classes;

public class CarData {

    public static void main(String[] args) {
        Pojo1 obj = new Pojo1();

        // Populate object
        obj.setName("Lambo");
        obj.setID(85);
        obj.setPrice(8000000000.45);
        obj.setcarEmail("some.gmail.com");

        // Process/Display data
        CarData printer = new CarData();
        printer.displayData(obj);
    }

    public void displayData(Pojo1 p) {
        System.out.println("Name: " + p.getName());
        System.out.println("Email: " + p.getCarEmail());
        System.out.println("Price: " + p.getName());
        System.out.println("ID: " + p.gerID());
    }
}