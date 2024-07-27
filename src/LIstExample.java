import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("krishna");
        list.add("Govinda");
        list.add("Radha");
        list.add("Sita");

//        list.remove(1);
//        list.remove("Ram");

        boolean ramexist =  list.contains("Ram");
        System.out.println(ramexist);
//        for (String name: list){
//            System.out.println(name);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(list.get(2));
    }
}
