import java.util.*;
public class PermutationEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        Map<Integer, Integer> valueToIndex = new HashMap<>();

        // Create a map to get the index of a value in O(1) time
        for (int i = 0; i < n; i++) {
            valueToIndex.put(p.get(i), i + 1);  // Store 1-based index
        }

        List<Integer> result = new ArrayList<>();

        // Find the required y for each z from 1 to n
        for (int z = 1; z <= n; z++) {
            int firstIndex = valueToIndex.get(z);  // Find a such that p(a) = z
            int secondIndex = valueToIndex.get(firstIndex);  // Find b such that p(b) = a
            result.add(secondIndex);
        }

        return result;
    }
    public static void main(String[] args) {
        List<Integer> p = Arrays.asList(5, 2, 1, 3, 4);
        System.out.println(permutationEquation(p));  // Output: [4, 2, 5, 1, 3]
    }
}
