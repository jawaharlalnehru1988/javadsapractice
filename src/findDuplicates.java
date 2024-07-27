import java.util.ArrayList;
import java.util.HashSet;

public class findDuplicates {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Krishna");
        people.add("Ram");
        people.add("Radha");
        people.add("Govinda");
        people.add("Ram");
        people.add("Sita");
        people.add("Sita");

        findDuplicatesValue(people);
    }

    private static void findDuplicatesValue(ArrayList<String> people) {
        HashSet<String> uniqueValue = new HashSet<>();
        HashSet<String> duplicateValues = new HashSet<>();

        for (String name: people){
            if (!uniqueValue.add(name)){
                duplicateValues.add(name);
            }
        }

        if(duplicateValues.isEmpty()){
            System.out.println("Duplicates elements are not found");
        } else {
            for (String name: duplicateValues){
                System.out.println(name);
            }
        }
    }
}
