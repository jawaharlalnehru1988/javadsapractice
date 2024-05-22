import java.util.Arrays;
import java.util.List;

public class billDivision {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        // Calculate the total bill excluding the k-th item
        int totalBill = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                totalBill += bill.get(i);
            }
        }

        // Calculate Anna's share
        int annaShare = totalBill / 2;

        // Compare Anna's share with the amount she contributed
        if (annaShare == b) {
            System.out.println("Bon Appetit");
        } else {
            // Calculate the difference Brian owes to Anna
            int refund = b - annaShare;
            System.out.println(refund);
        }
    }
    public static void main(String[] args) {
        // Example usage
        List<Integer> bill = Arrays.asList(2, 4, 6);
        int k = 2;
        int b = 6;
        bonAppetit(bill, k, b); // Should print 3
    }
}
