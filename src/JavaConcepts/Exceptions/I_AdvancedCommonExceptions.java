package JavaConcepts.Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Module I: Advanced Common Exceptions
 * -----------------------------------
 * Demonstrates real-world professional bugs that every Java 
 * developer will face at some point.
 */
public class I_AdvancedCommonExceptions {
    public static void main(String[] args) {
        
        System.out.println("--- 1. ConcurrentModificationException ---");
        try {
            List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
            
            // WRONG WAY: Modifying a list while iterating
            for (String fruit : fruits) {
                fruits.add("New fruit"); // BOOM! This will cause Exception on the next loop check
            }

        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Triggered by: Modifying a collection while looping through it.");
            System.out.println("Pro Tip: Use an Iterator or a Copy if you need to remove items.");
        }

        System.out.println("\n--- 2. IllegalThreadStateException (A type of IllegalArgumentException) ---");
        try {
            Thread myThread = new Thread(() -> {});
            myThread.start();
            myThread.start(); // ERROR: You can't start a thread twice!
        } catch (IllegalThreadStateException e) {
            System.out.println("Triggered by: Attempting to start a thread that has already been started.");
        }


        System.out.println("\n--- 3. StackOverflowError (Serious Error) ---");
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("Triggered by: Infinite recursion (The stack is full).");
        }
    }

    public static void recursiveMethod(int n) {
        // No exit condition!
        recursiveMethod(n + 1);
    }
}
