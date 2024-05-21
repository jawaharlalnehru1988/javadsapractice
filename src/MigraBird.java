import java.util.*;

public class MigraBird{
    public static int migratoryBirds(List<Integer> arr) {
        // Create a frequency map to count occurrences of each bird type
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int bird : arr) {
            frequencyMap.put(bird, frequencyMap.getOrDefault(bird, 0) + 1);
        }

        // Find the bird type with the maximum frequency and the smallest id in case of tie
        int maxFrequency = 0;
        int mostFrequentBird = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int birdType = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && birdType < mostFrequentBird)) {
                maxFrequency = frequency;
                mostFrequentBird = birdType;
            }
        }

        return mostFrequentBird;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);
        int result = migratoryBirds(arr);
        System.out.println("Most frequently sighted bird type: " + result);
    }
}

