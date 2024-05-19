import java.util.List;

public class distanceTree {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int appleCount = 0;
        int orangeCount = 0;
        //count apples that fall on sam's ground
        for(int apple: apples){
            int position = a + apple;
            if(position >= s && position <= t){
                appleCount++;
            }
        }
        for(int orange: oranges){
            int position = b+ orange;
            if(position >= s && position <= t){
                orangeCount++;
            }
        }
        //print the counts of apples and oranges
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args){
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        List<Integer> apples = List.of(2, 3, -4);
        List<Integer> oranges = List.of(3, -2, -4);
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
