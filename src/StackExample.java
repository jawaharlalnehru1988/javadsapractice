import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Size of the stack: " + stack.size());
    }
}
