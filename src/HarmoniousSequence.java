import java.util.Arrays;

public class HarmoniousSequence {
    public static int minOperationsToMakeHarmonious(int[] A) {
        int n = A.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0; // Base case: An empty sequence is already harmonious

        for (int i = n - 1; i >= 0; i--) {
            int groupSize = A[i];
            if (i + groupSize < n + 1) {
                boolean validGroup = true;
                for (int j = i + 1; j <= i + groupSize; j++) {
                    if (j >= n) {
                        validGroup = false;
                        break;
                    }
                }
                if (validGroup) {
                    dp[i] = dp[i + groupSize + 1];
                }
            }
            if (dp[i] == Integer.MAX_VALUE) {
                dp[i] = dp[i + 1] + 1;
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int[] sequence1 = {3, 7, 2, 6, 2, 4, 4};
        int[] sequence2 = {1, 8, 4, 5, 2, 6, 1};
        int[] sequence3 = {3, 2, 1};

        System.out.println("Minimum operations for sequence1: " + minOperationsToMakeHarmonious(sequence1));
        System.out.println("Minimum operations for sequence2: " + minOperationsToMakeHarmonious(sequence2));
        System.out.println("Minimum operations for sequence3: " + minOperationsToMakeHarmonious(sequence3));
    }
}
