import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayLIst {
    public static void main(String[] args){
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Hare");
        studentNames.add("Krishna");
        studentNames.add("Rama");
        studentNames.add(1, "Srimathi Radharani");
        System.out.println(studentNames);

        ArrayList<String> newList = new ArrayList<>();
        newList.add("Govind");
        newList.add("Mukunda");

        studentNames.addAll(newList);
        System.out.println(studentNames);
        System.out.println(studentNames.remove(5));
        studentNames.set(1, "Krishna");
        studentNames.set(2, "Hare");
        int index = studentNames.indexOf("Govind");
        if(index != -1){
            studentNames.set(index, "Krishna");
        }
        System.out.println(studentNames);
        System.out.println(studentNames.contains("Krishna"));
        /*for(String item: studentNames){
            System.out.println(item);
        }*/

        for(int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        // Using a for-each loop to iterate over the ArrayList
        for (int number : numbersList) {
            System.out.println(number);
        }
    }
}
