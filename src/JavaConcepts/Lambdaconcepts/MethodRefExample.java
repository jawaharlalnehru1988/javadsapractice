package JavaConcepts.Lambdaconcepts;

//public class Comparison {
//    public static void main(String[] args){
//        String str1 = "Hello";
//        String str2 = "Hello";
//
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1 == str4);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println(str3.equals(str4));
//    }
//}
import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
    public static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Hello", "World");
        messages.forEach(MethodRefExample::print); // Static method reference
    }
}
