package JavaConcepts.Lambdaconcepts;

/**
 * MODULE C: Variable Scope & Effectively Final
 * 
 * IMPORTANT INTERVIEW TOPIC: 
 * Lambdas can access local variables from the outer scope, 
 * but they must be "effectively final" (never modified).
 */
public class C_VariableScope {
    public static void main(String[] args) {
        String prefix = "Event: "; // Local variable
        
        // This is valid because 'prefix' is never modified after this
        Runnable eventLogger = () -> {
            System.out.println(prefix + "Lambda executed!");
        };
        
        eventLogger.run();

        // UNCOMMENTING THE LINE BELOW WILL CAUSE A COMPILATION ERROR
        // prefix = "New Event: "; 
        
        /* 
         * Error Message: "local variables referenced from a lambda expression 
         * must be final or effectively final"
         */
         
        System.out.println("Note: Lambdas capture the VALUE, not the variable itself.");
    }
}
