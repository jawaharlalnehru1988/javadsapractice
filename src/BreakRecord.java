import java.util.ArrayList;
import java.util.List;

public class BreakRecord {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minScore = scores.get(0);  // Initialize minimum score with the first game's score
        int maxScore = scores.get(0);  // Initialize maximum score with the first game's score
        int minRecordCount = 0;
        int maxRecordCount = 0;

        // Iterate through the scores starting from the second game
        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < minScore) {
                minScore = score;
                minRecordCount++;
            } else if (score > maxScore) {
                maxScore = score;
                maxRecordCount++;
            }
        }
        // Create an ArrayList to store the number of times Maria breaks her records
        List<Integer> recordCounts = new ArrayList<>();
        recordCounts.add(maxRecordCount);
        recordCounts.add(minRecordCount);
        return recordCounts;

    }
    public static void main(String[] args) {
        // Example usage
        List<Integer> scores = List.of(12, 24, 10, 24);
        List<Integer> recordCounts = breakingRecords(scores);
        System.out.println("Most points records broken: " + recordCounts.get(0));
        System.out.println("Least points records broken: " + recordCounts.get(1));
    }
}
