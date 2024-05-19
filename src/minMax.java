    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class minMax {
        public static void minMaxSum(List<Integer> arr){
            // Convert the immutable list to a mutable list
            List<Integer> mutableArr = new ArrayList<>(arr);
            Collections.sort(mutableArr);

            long minSum = 0;
            long maxSum = 0;

            //calculate the minumum sum by adding the first four elements
            for (int i = 0; i < 4; i++){
                minSum += arr.get(i);
            }
            for (int j = 1; j < 5; j++){
                maxSum += arr.get(j);
            }
            //print minimum and maximum sums
            System.out.println(minSum + " " + maxSum);
        }

        public static void main(String[] args){
            List<Integer> numbers = List.of(1, 3, 5, 7, 9);
            minMaxSum(numbers);
        }
    }
