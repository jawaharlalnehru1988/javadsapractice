package JavaConcepts.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Module G: Checked vs Unchecked Exceptions
 * ----------------------------------------
 * Shows why some exceptions MUST be handled (Checked) and others 
 * are optional (Unchecked).
 */
public class G_CheckedVsUnchecked {
    public static void main(String[] args) {
        
        // 1. UNCHECKED EXCEPTION (RuntimeException)
        // The compiler DOES NOT force you to catch this.
        String text = null;
        // System.out.println(text.length()); // This would crash at runtime, but compiles fine.

        // 2. CHECKED EXCEPTION (IOException, SQLException, etc.)
        // The compiler WILL NOT let you run this code until you handle it.
        
        try {
            readFile("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: The file was not found.");
        }

        System.out.println("Execution continues safely.");
    }

    /**
     * This method 'throws' a checked exception. 
     * Anyone calling this method MUST handle it.
     */
    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader file = new FileReader(fileName);
    }
}
