public class pageFlip {

        public static int pageCount(int n, int p) {
            // Calculate the number of page turns from the front
            int fromFront = p / 2;

            // Calculate the number of page turns from the back
            int fromBack;
            if (n % 2 == 0) {
                fromBack = (n - p + 1) / 2;
            } else {
                fromBack = (n - p) / 2;
            }

            // Return the minimum of the two
            return Math.min(fromFront, fromBack);
        }

        public static void main(String[] args) {
            // Example usage
            System.out.println(pageCount(5, 3)); // Should print 1
            System.out.println(pageCount(6, 2)); // Should print 1
        }
    }


