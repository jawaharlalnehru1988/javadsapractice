package JavaConcepts.Exceptions;

/**
 * Module F: Exception Handling Basics
 * ----------------------------------
 * Demonstrates the try-catch-finally mechanism and how Java handles 
 * runtime disruptions gracefully.
 */
public class F_ExceptionBasics {
    public static void main(String[] args) {
        
        System.out.println("--- Starting Program ---");

        try {
            // RISKY CODE
            System.out.println("Attempting division...");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result); // This line will NEVER run
        } 
        catch (ArithmeticException e) {
            // HANDLING THE ERROR
            System.out.println("Caught an Exception: " + e.getMessage());
            System.out.println("Don't worry, the program is still running!");
        } 
        finally {
            // GUARANTEED CLEANUP
            // This block runs no matter what (even if there is no exception)
            System.out.println("Finally block: Closing resources or finishing up.");
        }

        System.out.println("\n--- Multiple Catch Blocks ---");
        try {
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointer: Handle objects carefully!");
        } 
        catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        }

        System.out.println("--- Program Ended Successfully ---");
    }
}
