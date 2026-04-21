package JavaConcepts.Exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Module H: Common Built-in Exceptions
 * -----------------------------------
 * A laboratory demonstrating the most frequent "Default" exceptions 
 * in Java and what triggers them.
 */
public class H_CommonExceptions {
    public static void main(String[] args) {
        
        System.out.println("--- 1. ArithmeticException ---");
        try {
            int result = 50 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Triggered by: Mathematical errors (like /0)");
        }

        System.out.println("\n--- 2. NullPointerException (NPE) ---");
        try {
            String name = null;
            name.toUpperCase(); // Calling methods on null object
        } catch (NullPointerException e) {
            System.out.println("Triggered by: Accessing methods/properties of a 'null' object");
        }

        System.out.println("\n--- 3. ArrayIndexOutOfBoundsException ---");
        try {
            int[] arr = {1, 2, 3};
            int val = arr[10]; // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Triggered by: Accessing an index that doesn't exist");
        }

        System.out.println("\n--- 4. NumberFormatException ---");
        try {
            String age = "twenty";
            int parsedAge = Integer.parseInt(age); // Invalid format for parsing
        } catch (NumberFormatException e) {
            System.out.println("Triggered by: Trying to convert a string to a number incorrectly");
        }

        System.out.println("\n--- 5. ClassCastException ---");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid type casting
        } catch (ClassCastException e) {
            System.out.println("Triggered by: Attempting to cast an object to an incompatible type");
        }

        System.out.println("\n--- 6. IllegalArgumentException ---");
        try {
            setAge(-5); // Custom validation throwing built-in exception
        } catch (IllegalArgumentException e) {
            System.out.println("Triggered by: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
    }
}
