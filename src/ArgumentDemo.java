public class ArgumentDemo {
    
    public static void main(String[] bananas) {
        
        if (bananas.length > 0) {
            System.out.println("Arguments received!");
            
            for (int i = 0; i < bananas.length; i++) {
                System.out.println("Argument " + i + ": " + bananas[i]);
            }
        } else {
            System.out.println("❌ No arguments were passed.");
        }
    }
}
