package JavaConcepts.Lambdaconcepts;

/**
 * MODULE A: Lambda Syntax & Anatomy
 * 
 * Lambda basics: (parameters) -> { body }
 */
public class A_LambdaSyntax {
    
    // Custom interface for demonstration
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);
    }

    public static void main(String[] args) {
        
        // 1. Multiple parameters with type inference
        // Java knows 'a' and 'b' are ints because of the interface definition
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition (10 + 5): " + addition.operate(10, 5));

        // 2. Multi-line body (requires curly braces and 'return' keyword)
        MathOperation subtraction = (a, b) -> {
            System.out.println("Subtracting " + b + " from " + a);
            return a - b;
        };
        System.out.println("Subtraction (10 - 5): " + subtraction.operate(10, 5));

        // 3. Single parameter (parentheses are optional)
        Greeting simpleGreet = name -> System.out.println("Hello, " + name);
        simpleGreet.sayHello("User");

        // 4. No parameters
        Runnable noParam = () -> System.out.println("No parameters here!");
        noParam.run();
    }
}
