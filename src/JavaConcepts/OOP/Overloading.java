package JavaConcepts.OOP;

class Calculator {
    // Overloaded methods with different parameter lists
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10)); // Calls the first method
        System.out.println(calc.add(5.5, 10.5)); // Calls the second method
        System.out.println(calc.add(5, 10, 15)); // Calls the third method
    }
}
