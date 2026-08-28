package exception_handling;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();

        try {
            
            demo.display("divide", 10, 0); 
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

   
    void display(String op, int a, int b) throws Exception {
        switch (op) {
            case "add":
                System.out.println("Result: " + (a + b)); // Fixed syntax
                break;
            case "divide":
                if (b == 0) {
                   
                    throw new Exception("Cannot divide by zero in display()");
                }
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}