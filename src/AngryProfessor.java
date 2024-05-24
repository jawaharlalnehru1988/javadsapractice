import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        int onTimeCount = 0; // Counter for students who arrived on time

        for (int arrivalTime : a) { // Iterate through each arrival time
            if (arrivalTime <= 0) { // Check if the student arrived on time
                onTimeCount++;
            }
        }

        return onTimeCount < k ? "YES" : "NO"; // Determine if class is canceled
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine()); // Number of test cases

        for (int i = 0; i < t; i++) {
            String[] nk = reader.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] arrivalTimes = reader.readLine().split(" ");
            List<Integer> a = new ArrayList<>();
            for (String time : arrivalTimes) {
                a.add(Integer.parseInt(time));
            }

            System.out.println(angryProfessor(k, a)); // Print the result for each test case
        }
    }
}


/*A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time (arrivalTime < 0) to arrived late (
arrivalTime > 0).
Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.
Example
n=5
k=3
a=[-2, -1, 0, 1, 2]
The first 3 students arrived on. The last 2 were late. The threshold is 3 students, so class will go on. Return YES.
Note: Non-positive arrival times (a[i] <0) indicate the student arrived early or on time; positive arrival times (a[i] > 0) indicate the student arrived a[i] minutes late.
Function Description
Complete the angry Professor function in the editor below. It must return YES if class is cancelled, or NO otherwise. angry Professor has the following parameter(s):
int k: the threshold number of students
• int a[n]: the arrival times of the n students
Returns
• string: either YES or NO
Input Format
The first line of input contains t, the number of test cases.
Each test case consists of two lines.
The first line has two space-separated integers, n and k, the number of students (size of a) and the cancellation threshold.
The second line contains n space-separated integers (a[1], a[2],..., a[n])
that describe the arrival times for each student.
  public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here

    }
 */

/*To solve the problem of determining whether the class is canceled based on student arrival times and a threshold number of students, we need to count how many students arrived on time (arrival time <= 0). If this count is less than the threshold
𝑘
k, the class is canceled; otherwise, it proceeds.

Here's the step-by-step approach in pseudocode:

Initialize a counter for the number of students who arrived on time.
Iterate through the list of arrival times.
If the arrival time is less than or equal to 0, increment the counter.
Compare the counter with the threshold
𝑘
k:
If the counter is less than
𝑘
k, return "YES" (class is canceled).
Otherwise, return "NO" (class is not canceled).*/

/*
Explanation:
angryProfessor Method:

We initialize a counter onTimeCount to count the number of students who arrived on time.
We iterate through the list a of arrival times. If an arrival time is less than or equal to 0, we increment the onTimeCount.
After counting, we compare onTimeCount with the threshold k. If onTimeCount is less than k, we return "YES" (class is canceled); otherwise, we return "NO" (class is not canceled).
main Method:

We use BufferedReader to read the input efficiently.
We read the number of test cases t.
For each test case, we read the values of n (number of students) and k (threshold number of students).
We read the arrival times of the students into a list a.
We call the angryProfessor method with k and a as arguments and print the result.
This approach ensures that we efficiently determine whether the class is canceled based on the given conditions.
*/