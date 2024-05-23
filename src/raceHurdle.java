import java.util.Arrays;
import java.util.List;

public class raceHurdle {
    public static int hurdleRace(int k, List<Integer> height) {
        // Find the maximum height in the list of hurdles
        int maxHurdle = 0;
        for (int h : height) {
            if (h > maxHurdle) {
                maxHurdle = h;
            }
        }

        // Calculate the number of doses needed
        int doses = maxHurdle - k;

        // If doses is negative or zero, return 0, otherwise return the doses
        return Math.max(doses, 0);
    }
    public static void main(String[] args) {
        // Test case 1
        int k1 = 1;
        List<Integer> height1 = Arrays.asList(1, 2, 3, 3, 2);
        int result1 = raceHurdle.hurdleRace(k1, height1);
        System.out.println("Test Case 1: " + result1); // Expected output: 2

        // Test case 2
        int k2 = 4;
        List<Integer> height2 = Arrays.asList(1, 6, 3, 5, 2);
        int result2 = raceHurdle.hurdleRace(k2, height2);
        System.out.println("Test Case 2: " + result2); // Expected output: 2

        // Test case 3
        int k3 = 7;
        List<Integer> height3 = Arrays.asList(1, 2, 3, 4, 5);
        int result3 = raceHurdle.hurdleRace(k3, height3);
        System.out.println("Test Case 3: " + result3); // Expected output: 0
    }
}
