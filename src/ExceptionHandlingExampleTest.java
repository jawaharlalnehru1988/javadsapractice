import java.util.Scanner;
public class ExceptionHandlingExampleTest {
    public static void main(String[] args) {
        // Test case 1: Division by zero (ArithmeticException)
        try {
            int number = 0; // Zero causes division by zero error
            int result = 100 / number; // This line should throw ArithmeticException
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Test case 1: Division by zero handled successfully.");
        } catch (Exception e) {
            System.out.println("Test case 1: Unexpected exception occurred.");
        }

        // Test case 2: Valid division (no exception)
        try {
            int number = 5; // Valid number for division
            int result = 100 / number; // No exception should occur
            System.out.println("Result: " + result); // Result should be printed
        } catch (ArithmeticException e) {
            System.out.println("Test case 2: Division by zero handled successfully.");
        } catch (Exception e) {
            System.out.println("Test case 2: Unexpected exception occurred.");
        }

        // Test case 3: Other exception (InputMismatchException)
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // This line might throw InputMismatchException
            scanner.close();
            int result = 100 / number; // This line won't execute if InputMismatchException occurs
            System.out.println("Result: " + result); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Test case 3: Division by zero handled successfully.");
        } catch (Exception e) {
            System.out.println("Test case 3: Unexpected exception occurred: " + e.getClass().getSimpleName());
        }
    }
}
