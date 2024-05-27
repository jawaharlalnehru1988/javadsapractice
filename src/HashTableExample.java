import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Retrieve and print a value from the HashMap
        String value = hashMap.get(2);
        System.out.println("Value for key 2: " + value); // Output: Value for key 2: Two

        // Remove a value from the HashMap
        hashMap.remove(3);
        System.out.println("Key 3 removed. Current HashMap: " + hashMap);

        // Check if the HashMap contains a specific key
        boolean containsKey = hashMap.containsKey(1);
        System.out.println("HashMap contains key 1: " + containsKey); // Output: HashMap contains key 1: true

        // Check if the HashMap contains a specific value
        boolean containsValue = hashMap.containsValue("Three");
        System.out.println("HashMap contains value 'Three': " + containsValue); // Output: HashMap contains value 'Three': false

        // Iterate over the HashMap and print all key-value pairs
        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
