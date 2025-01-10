import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCharacterOccurrance {
    public static void lowerCaseCharacterOccurrence(String str) {
        int hash[] = new int[26];
        // Pre compute
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }
        // Fetch
        for (int i = 0; i < str.length(); i++) {
            if(hash[str.charAt(i) - 'a'] != -1) {
                System.out.println("Occurrence of "+str.charAt(i)+" is "+hash[str.charAt(i) - 'a']);
                hash[str.charAt(i) - 'a'] = -1;
            }
        }
    }

    public static void anyCharacterOccurrence(String str) {
        int hash[] = new int[256];
        // Pre compute
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        // Fetch
        for (int i = 0; i < str.length(); i++) {
            if(hash[str.charAt(i)] != -1) {
                System.out.println("Occurrence of "+str.charAt(i)+" is "+hash[str.charAt(i)]);
                hash[str.charAt(i)] = -1;
            }
        }
    }

    public static void characterOccurrenceUsingHashMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        // Pre compute
        for (int i = 0; i < str.length();i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        
        // Fetching
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        // lowerCaseCharacterOccurrence(str);
        // anyCharacterOccurrence(str);
        characterOccurrenceUsingHashMap(str);
        sc.close();
    }
}
