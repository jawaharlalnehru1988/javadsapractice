
    import java.util.List;

    public class DivideSum {
        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
            int count = 0;

            // Iterate through the array and check pairs of elements
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int sum = ar.get(i) + ar.get(j);
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }

            return count;
        }

        public static void main(String[] args) {
            // Example usage
            List<Integer> ar = List.of(1, 2, 3, 4, 5, 6);
            int k = 5;
            int n = ar.size();
            int pairs = divisibleSumPairs(n, k, ar);
            System.out.println("Number of pairs: " + pairs);
        }
    }


