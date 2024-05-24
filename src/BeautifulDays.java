public class BeautifulDays {
    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        // Loop through each day in the range
        for (int day = i; day <= j; day++) {
            // Get the absolute difference between the day and its reverse
            int difference = Math.abs(day - reverse(day));

            // Check if the difference is divisible by k (evenly divided with no remainder)
            if (difference % k == 0) {
                beautifulDays++;
            }
        }

        return beautifulDays;
    }

    // Helper function to reverse a number
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            // Extract the last digit
            int lastDigit = num % 10;

            // Add the last digit (shifted to the appropriate position) to the reversed number
            reversed = reversed * 10 + lastDigit;

            // Remove the last digit from the original number
            num /= 10;
        }
        return reversed;
    }

}
