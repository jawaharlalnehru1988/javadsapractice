public class TwoPointers {

    public static boolean hasPairWithSum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6};
        int target = 9;

        boolean result = hasPairWithSum(array, target);
        if (result) {
            System.out.println("Array has a pair with the given sum.");
        } else {
            System.out.println("Array does not have a pair with the given sum.");
        }
    }
}
