import java.util.Scanner;

public class UtopianTree {
    public static int utopianTree(int n) {
        int height = 1; // Initial height of the tree

        for (int i = 1; i <= n; i++) { // Iterate through each growth cycle
            if (i % 2 == 1) { // Spring cycle (odd)
                height *= 2;
            } else { // Summer cycle (even)
                height += 1;
            }
        }

        return height; // Return the final height of the tree
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of growth cycles for each test case
            System.out.println(utopianTree(n)); // Print the height of the tree after n cycles
        }

        scanner.close();
    }
}
