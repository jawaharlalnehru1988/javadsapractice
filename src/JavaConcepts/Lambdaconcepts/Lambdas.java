package JavaConcepts.Lambdaconcepts;
import java.util.Arrays;
import java.util.List;


public class Lambdas {
    public static void main(String[] args) {
        // Sort a list of strings by length(ascending) using lambda expression
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        list.sort((a, b) -> a.length() - b.length());
        System.out.println(list);
    }

}
