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
    public static void main(String[] args) {
        String str = "sandeepsahani";
        lowerCaseCharacterOccurrence(str);
        anyCharacterOccurrence(str);
    }
}
