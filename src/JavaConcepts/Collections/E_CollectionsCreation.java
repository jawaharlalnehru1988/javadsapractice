package JavaConcepts.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Module E: Collections Creation
 * -----------------------------
 * Demonstrates various ways to initialize Lists and Arrays in Java,
 * highlighting mutability, null handling, and version-specific methods.
 */
public class E_CollectionsCreation {
    public static void main(String[] args) {
        
        System.out.println("--- 1. Arrays.asList() ---");
        // Fixed-size, backed by array. Can update, but can't add/remove.
        List<String> fixedSizeList = Arrays.asList("Apple", "Banana", "Cherry");
        fixedSizeList.set(1, "Blueberry"); // This is allowed
        System.out.println("After set: " + fixedSizeList);
        try {
            fixedSizeList.add("Date"); // Throws Exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught Expected Error: Cannot add to Arrays.asList()");
        }

        System.out.println("\n--- 2. List.of() (Java 9+) ---");
        // Truly unmodifiable (Immutable).
        List<String> immutableList = List.of("Earth", "Mars", "Jupiter");
        System.out.println("Immutable List: " + immutableList);
        try {
            immutableList.set(0, "Venus"); // Throws Exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught Expected Error: List.of() is completely immutable");
        }

        System.out.println("\n--- 3. Fully Mutable ArrayList ---");
        // Best for general purpose use.
        List<String> mutableList = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        mutableList.add("Four");
        mutableList.remove("One");
        System.out.println("Mutable List: " + mutableList);

        System.out.println("\n--- 4. Java 16+ Stream.toList() ---");
        // Modern approach starting from Java 16.
        List<Integer> streamList = Stream.of(1, 2, 3, 4, 5)
                                         .filter(n -> n % 2 != 0)
                                         .toList(); // Returns unmodifiable list
        System.out.println("Odd numbers from Stream: " + streamList);

        System.out.println("\n--- 5. Arrays Creation ---");
        // Inline literal (only during assignment)
        String[] colors = {"Red", "Green", "Blue"};
        
        // Explicit initialization
        int[] numbers = new int[]{10, 20, 30};
        
        System.out.println("Array length: " + colors.length);
    }
}
