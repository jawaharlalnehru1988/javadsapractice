import java.util.Collections;
import java.util.List;

public class birthDayCandleCake {
    public static int birthDayCakeCandles(List<Integer> candles){
         int maxHeight = Collections.max(candles);
        int tallestCandlesCount = 0;
        for(int candleHeight: candles){
    if(candleHeight == maxHeight){
        tallestCandlesCount++;
    }
        }
        return tallestCandlesCount;
    }
    public static void main(String[] args){
        List<Integer> numbers = List.of(4, 4, 2, 3, 5, 5, 4, 5);
        int tallestCandles = birthDayCakeCandles(numbers);
        System.out.println("Number of tallest candles: " + tallestCandles);
    }
}
