public class CountValley {

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int valleys = 0;
        boolean inValley = false;

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                seaLevel++;
            } else if (step == 'D') {
                seaLevel--;
            }

            if (seaLevel < 0 && !inValley) {
                valleys++;
                inValley = true;
            } else if (seaLevel >= 0 && inValley) {
                inValley = false;
            }
        }

        return valleys;
    }

    public static void main(String[] args) {
        // Test case 1: Hiker enters and exits one valley
        int steps1 = 8;
        String path1 = "DDUUUUDD";
        int result1 = CountValley.countingValleys(steps1, path1);
        System.out.println("Test Case 1: " + result1); // Expected output: 1

        // Test case 2: Hiker stays at or above sea level
        int steps2 = 12;
        String path2 = "UUDDUUDDUUDD";
        int result2 = CountValley.countingValleys(steps2, path2);
        System.out.println("Test Case 2: " + result2); // Expected output: 0
    }
}