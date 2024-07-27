import java.util.HashMap;
import java.util.Map;

public class HashingExample {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Hare", 30);
        people.put("Krishna", 21);
        people.put("Rama", 32);

        System.out.println("hare's age "+ people.get("Hare"));
        System.out.println("Krishna's age "+ people.get("Krishna"));
        System.out.println("Rama's age "+ people.get("Rama"));

        for (Map.Entry<String, Integer> entry: people.entrySet()){
            System.out.println(entry.getKey() + "'s age" + entry.getValue());
        }
        String key = "Hare";
        int hash = key.hashCode();
        System.out.println("Hash code for key \"" + key + "\": " + hash);
    }

}
