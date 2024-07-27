import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(14);
        num.add(3);
        num.add(6);
        num.add(9);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);


    }

}
