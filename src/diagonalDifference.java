import java.util.List;

public class diagonalDifference {
public static int diagDiff(List<List<Integer>> arr){
    int n = arr.size();
    int leftDiagonalSum = 0;
    int rightDiagonalSum = 0;
    for (int i=0; i<n; i++){
        List<Integer> row = arr.get(i);
        leftDiagonalSum += row.get(i); //Sum of elements in left diagonal
        rightDiagonalSum += row.get(n-1-i); //Sum of elements in the right diagonal
    }
    return Math.abs(leftDiagonalSum - rightDiagonalSum);
}
public static void main(String[] args){
    List<List<Integer>> matrix = List.of(
            List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
    int absoluteDifference = diagDiff(matrix);
    System.out.println("Absolute Difference: " + absoluteDifference);
}
}
