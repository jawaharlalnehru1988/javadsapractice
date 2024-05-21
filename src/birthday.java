import java.util.List;

public class birthday {
    public static int birthChocolate(List<Integer> s, int d, int m){
        int ways = 0;
        for(int i = 0; i<= s.size() - m; i++){
            int sum = 0;
            for(int j = i; j < i + m; j++){
                sum += s.get(j);
            }
            if(sum == d){
                ways++;
            }
        }
    return ways;
    }
    public static void main(String[] args){
        List<Integer> s = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 2;
        int result = birthChocolate(s, d, m);
        System.out.println("Numbers of ways to divide the chocolate: " + result);
    }
}
