package JavaConcepts.Lambdaconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * MODULE D: Real-world Streams Integration
 * 
 * This is where lambdas shine! They allow us to process 
 * collections in a functional, readable way.
 */
public class D_StreamsIntegration {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Goal: Get a list of names that start with 'A' or 'B' in UPPERCASE
        List<String> result = names.stream()
            .filter(name -> name.startsWith("A") || name.startsWith("B")) // Lambda for Predicate
            .map(name -> name.toUpperCase())                              // Lambda for Function
            .collect(Collectors.toList());

        System.out.println("Processed Names: " + result);

        // Goal: Print each name with its length
        System.out.println("\nName Lengths:");
        names.forEach(name -> {
            int length = name.length();
            System.out.println(name + " has " + length + " characters.");
        });
    }
}
