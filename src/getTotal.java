import java.util.Arrays;
import java.util.List;

public class getTotal {

        public static int getTotalX(List<Integer> a, List<Integer> b) {
            int count = 0;

            for (int num = 1; num <= 100; num++) { // Assuming the numbers are between 1 and 100
                boolean isFactor = true;

                // Check if num is a factor of all elements in list b
                for (int element : b) {
                    if (element % num != 0) {
                        isFactor = false;
                        break;
                    }
                }

                // Check if all elements in list a are factors of num
                if (isFactor) {
                    for (int factor : a) {
                        if (num % factor != 0) {
                            isFactor = false;
                            break;
                        }
                    }
                }

                // If num satisfies both conditions, increment the count
                if (isFactor) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            // Sample test case 1
            List<Integer> a1 = Arrays.asList(2, 4);
            List<Integer> b1 = Arrays.asList(16, 32, 96);
            int result1 = getTotalX(a1, b1);
            System.out.println("Result 1: " + result1); // Expected output: 3

            // Sample test case 2
            List<Integer> a2 = Arrays.asList(2, 6);
            List<Integer> b2 = Arrays.asList(24, 36);
            int result2 = getTotalX(a2, b2);
            System.out.println("Result 2: " + result2); // Expected output: 2

            // You can add more test cases to verify the function
            List<Integer> a3 = Arrays.asList(1);
            List<Integer> b3 = Arrays.asList(100);
            int result3 = getTotalX(a3, b3);
            System.out.println("Result 3: " + result3); // Expected output: 9
        }
    }
