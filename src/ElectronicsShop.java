public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1; // Initialize the maximum spent to -1

        for (int keyboard : keyboards) { // Iterate over each keyboard price
            for (int drive : drives) { // Iterate over each drive price
                int totalCost = keyboard + drive; // Calculate the total cost of the current combination
                if (totalCost <= b && totalCost > maxSpent) { // Check if within budget and greater than current max
                    maxSpent = totalCost;
                }
            }
        }

        return maxSpent; // Return the maximum cost found
    }

    public static void main(String[] args) {
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};
        int budget = 60;

        int result = getMoneySpent(keyboards, drives, budget);
        System.out.println("Maximum money spent: " + result);
    }
}
//A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return -1.
//Example
//b=60
//keyboards = [40, 50, 60]
//drives = [5, 8, 12]
//The person can buy a 40 keyboard + 12 USB drive = 52, or a
//50 keyboard + 8 USB drive = 58. Choose the latter as the more expensive option and return 58.
//Function Description
//Complete the getMoneySpent function in the editor below. getMoneySpent has the following parameter(s):
//• int keyboards[n]: the keyboard prices
//• int drives[m]: the drive prices
//• int b: the budget