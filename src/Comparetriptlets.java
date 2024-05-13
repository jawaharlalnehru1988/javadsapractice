import java.util.ArrayList;
import java.util.List;

public class Comparetriptlets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> points = new ArrayList<>();
        points.add(0); // Alice's initial points
        points.add(0); // Bob's initial points

        for (int i = 0; i < 3; i++) {
            int scoreA = a.get(i);
            int scoreB = b.get(i);

            if (scoreA > scoreB) {
                points.set(0, points.get(0) + 1); // Alice gets 1 point
            } else if (scoreA < scoreB) {
                points.set(1, points.get(1) + 1); // Bob gets 1 point
            }
            // If scores are equal, neither gets a point
        }

        return points;
    }

    public static void main(String[] args) {
        List<Integer> aliceRatings = new ArrayList<>();
        aliceRatings.add(1); // Alice's clarity rating
        aliceRatings.add(2); // Alice's originality rating
        aliceRatings.add(3); // Alice's difficulty rating

        List<Integer> bobRatings = new ArrayList<>();
        bobRatings.add(3); // Bob's clarity rating
        bobRatings.add(2); // Bob's originality rating
        bobRatings.add(1); // Bob's difficulty rating

        List<Integer> result = Comparetriptlets.compareTriplets(aliceRatings, bobRatings);
        System.out.println("Alice's points: " + result.get(0)); // Should print 1
        System.out.println("Bob's points: " + result.get(1)); // Should print 2
    }
}

