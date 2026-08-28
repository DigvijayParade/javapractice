package exception_handling;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {
            System.out.println("--- Inside Try Block ---");

            // UNCOMMENT ONLY ONE LINE AT A TIME TO TEST SPECIFIC CATCH BLOCKS:

//             Test 1: Triggers ArithmeticException
//             int result = 10 / 0;

            // Test 2: Triggers NullPointerException
            // String text = null;
            // System.out.println(text.length());

            // Test 3: Triggers ArrayIndexOutOfBoundsException
            // int[] numbers = {10, 20, 30};
            // System.out.println(numbers[5]);

//             Test 4: Triggers NumberFormatException
             int parsedNumber = Integer.parseInt("Hello");


            System.out.println("No exception was triggered.");

        } catch (ArithmeticException e) {
            System.out.println("-> Handled by ArithmeticException block");
            System.out.println("   Reason: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("-> Handled by NullPointerException block");
            System.out.println("   Reason: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-> Handled by ArrayIndexOutOfBoundsException block");
            System.out.println("   Reason: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("-> Handled by NumberFormatException block");
            System.out.println("   Reason: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("-> Handled by general Exception block");
            System.out.println("   Reason: " + e.getMessage());
        }
    }
}