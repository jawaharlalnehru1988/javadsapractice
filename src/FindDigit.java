public class FindDigit {
    public static int findDigits(int n) {
        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        int t = 3; // Number of test cases
        int[] testCases = {124, 111, 10};

        for (int i = 0; i < t; i++) {
            System.out.println(findDigits(testCases[i]));
        }
    }
}
