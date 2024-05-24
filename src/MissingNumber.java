import java.util.*;

public class MissingNumber {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Create hash maps to count frequency of numbers
        Map<Integer, Integer> arrFreq = new HashMap<>();
        Map<Integer, Integer> brrFreq = new HashMap<>();

        // Count frequency of numbers in arr
        for (int num : arr) {
            arrFreq.put(num, arrFreq.getOrDefault(num, 0) + 1);
        }

        // Count frequency of numbers in brr
        for (int num : brr) {
            brrFreq.put(num, brrFreq.getOrDefault(num, 0) + 1);
        }

        // Find missing numbers
        Set<Integer> missingNumbers = new HashSet<>();
        for (int num : brrFreq.keySet()) {
            int countInArr = arrFreq.getOrDefault(num, 0);
            int countInBrr = brrFreq.get(num);
            if (countInArr < countInBrr) {
                missingNumbers.add(num);
            }
        }

        // Convert set to sorted list and return
        List<Integer> result = new ArrayList<>(missingNumbers);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7, 2, 5, 3, 5, 3);
        List<Integer> brr = Arrays.asList(7, 2, 5, 4, 6, 3, 5, 3);
        List<Integer> missing = missingNumbers(arr, brr);
        System.out.println(missing);  // Output: [4, 6]
    }
}
