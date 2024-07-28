public class MaximumSalary {

    public static int getMaxSalary(int num, int[][] payments) {
        int[] dp_no_task = new int[num + 1];
        int[] dp_easy = new int[num + 1];
        int[] dp_hard = new int[num + 1];

        dp_no_task[0] = 0;
        dp_easy[0] = 0;
        dp_hard[0] = 0;

        for (int i = 1; i <= num; i++) {
            int easy = payments[i - 1][0];
            int hard = payments[i - 1][1];

            dp_no_task[i] = Math.max(dp_no_task[i - 1], Math.max(dp_easy[i - 1], dp_hard[i - 1]));
            dp_easy[i] = Math.max(dp_no_task[i - 1], Math.max(dp_easy[i - 1], dp_hard[i - 1])) + easy;
            dp_hard[i] = dp_no_task[i - 1] + hard;
        }

        return Math.max(dp_no_task[num], Math.max(dp_easy[num], dp_hard[num]));
    }

    public static void main(String[] args) {
        int num = 4;
        int[][] payments = {
                {1, 2},
                {4, 10},
                {20, 21},
                {2, 23}
        };

        int maxSalary = getMaxSalary(num, payments);
        System.out.println(maxSalary); // Output: 33
    }
}
