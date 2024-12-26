// TreeMap is a data structure that stores elements in a sorted order.
// Time complexity of TreeMap is O(log n) for adding and removing elements.
package map;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
           // String is the key and Integer is the value.
        Map<String, Integer> hashMap = new TreeMap<>();

        // Adding elements to the HashMap
        
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
    
        hashMap.put("two", 4); // It will replace the value of key "two" from 2 to 4

        hashMap.putIfAbsent("two", 4); // It will not replace the value of key "two" because it is already present
        System.out.println(hashMap);

        // Iterate over the HashMap. Get the key and value of the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterate over the keys of the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        // Iterate over the values of the HashMap
        for (Integer value : hashMap.values()) {
            System.out.println(value);
        }

        // Check for the presence of a key in the HashMap
        boolean isPresent = hashMap.containsKey("two");
        System.out.println(isPresent);

        // Check for the presence of a value in the HashMap
        boolean isValuePresent = hashMap.containsValue(4);
        System.out.println(isValuePresent);

        // Check if the HashMap is empty
        boolean isEmpty = hashMap.isEmpty();
        System.out.println(isEmpty);

        // Remove element from the HashMap
        hashMap.remove("two");
        System.out.println(hashMap);
    }

}
