import java.util.*;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();
        List<Integer> result = new ArrayList<>();

        // Normalize the number of rotations
        k = k % n;

        for (int query : queries) {
            // Calculate the original index in the rotated array
            int originalIndex = (query - k + n) % n;
            result.add(a.get(originalIndex));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3, 4, 5);
        int k = 2;
        List<Integer> queries = Arrays.asList(1, 2);

        List<Integer> result = circularArrayRotation(a, k, queries);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
