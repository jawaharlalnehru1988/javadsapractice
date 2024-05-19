import java.util.List;

public class plusMinus {
    public static void plMinus(List<Integer> arr){
        int n = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int num: arr){
            if(num > 0){
                positiveCount++;
            } else if(num < 0){
                negativeCount++;
            } else {
                zeroCount++;
            }

            }

        double positiveRatio = (double) positiveCount/n;
        double negativeRatio = (double) negativeCount/n;
        double zeroRatio = (double) zeroCount/n;

        //print ratios with 6 decimal places
        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);
        }
        public static void main(String[] args){

        List<Integer> numbers = List.of(1, 1, 0, -1, -1);
        plMinus(numbers);
        }
    }


