import java.util.*;

public class CutTheStick {
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        Collections.sort(arr);

        int n = arr.size();
        int i = 0;

        while (i < n) {
            result.add(n - i);
            int currentLength = arr.get(i);

            while (i < n && arr.get(i) == currentLength) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> sticks = Arrays.asList(5, 4, 4, 2, 2, 8);
        System.out.println(cutTheSticks(sticks)); // Output: [6, 4, 2, 1]
    }
}

