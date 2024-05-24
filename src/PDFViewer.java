import java.util.List;

public class PDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;

        for (char c : word.toCharArray()) {
            int height = h.get(c - 'a');
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        List<Integer> heights = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 1, 1, 5, 5, 1, 5, 2, 5, 5, 5, 5, 5, 5);
        String word = "torn";

        int area = designerPdfViewer(heights, word);
        System.out.println("Highlighted area: " + area + " mm²");
    }
}
