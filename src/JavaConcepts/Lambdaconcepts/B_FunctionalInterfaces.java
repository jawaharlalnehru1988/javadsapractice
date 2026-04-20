package JavaConcepts.Lambdaconcepts;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

/**
 * MODULE B: Built-in Functional Interfaces
 * 
 * Java provides standard interfaces in java.util.function so you don't
 * have to create your own every time.
 */
public class B_FunctionalInterfaces {
    public static void main(String[] args) {

        // 1. Predicate<T> -> Takes one argument, returns boolean
        // Use for: Filtering, Validation
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println("Is 'Lambda' longer than 5? " + isLongerThan5.test("Lambda"));

        // 2. Consumer<T> -> Takes one argument, returns void
        // Use for: Printing, saving to DB, side effects
        Consumer<String> printer = s -> System.out.println("Consumer printing: " + s.toUpperCase());
        printer.accept("hello java");

        // 3. Supplier<T> -> Takes zero arguments, returns a value
        // Use for: Generating IDs, Lazy initialization
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Supplier generated: " + randomValue.get());

        // 4. Function<T, R> -> Takes T, returns R
        // Use for: Transformation, mapping
        // Example: Convert String price to Integer
        Function<String, Integer> stringToInt = s -> Integer.parseInt(s);
        int result = stringToInt.apply("123");
        System.out.println("Function result (int): " + result);
    }
}
