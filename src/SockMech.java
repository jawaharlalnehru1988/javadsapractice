import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMech {
    public static int sockMerchant(int n, List<Integer> ar) {
        // Create a HashMap to store the count of each color
        Map<Integer, Integer> colorCounts = new HashMap<>();

        // Iterate through the list and count the occurrences of each color
        for (int color : ar) {
            colorCounts.put(color, colorCounts.getOrDefault(color, 0) + 1);
        }

        // Calculate the number of pairs for each color
        int pairs = 0;
        for (int count : colorCounts.values()) {
            pairs += count / 2;
        }

        return pairs;
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> socks = List.of(1, 2, 1, 2, 1, 3, 2);
        int n = socks.size();
        int result = sockMerchant(n, socks);
        System.out.println(result); // Should print 2
    }
}
