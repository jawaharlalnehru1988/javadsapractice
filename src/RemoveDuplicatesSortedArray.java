public class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        int uniqueIndex = 0;

        for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex] != array[uniqueIndex]) {
                uniqueIndex++;
                array[uniqueIndex] = array[currentIndex];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};

        int newLength = removeDuplicates(array);

        System.out.println("New length after removing duplicates: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
