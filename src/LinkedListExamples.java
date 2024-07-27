import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("LinkedList: " + list);

        // Add an element at the first position
        list.addFirst(5);
        System.out.println("After addFirst: " + list);

        // Add an element at the last position
        list.addLast(50);
        System.out.println("After addLast: " + list);

        // Get the first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Remove the first and last elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + list);

        // Traverse the LinkedList
        System.out.print("Traversing the LinkedList: ");
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}

