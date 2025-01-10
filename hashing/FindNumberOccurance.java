import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class FindNumberOccurance {
    // Find the occurance of a number without using hashing.
    // Brute force approach
    // TC: O(N) -> For a single element
    // TC: N * O(N) -> For the entire array
    public static int occurance(int number, int arr[]) {
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == number) {
                count++;
            }
        }
        return count;
    } 
    // Find the occurance of a number with using hashing.
    // Optimal approach
    // TC: O(N) -> For the entire array
    public static void occurrenceOptimal(int arr[]) {
        
        // Pre calculations
        int hash[] = new int[13];
        for(int i = 0;i < arr.length;i++) {
            hash[arr[i]] += 1;
        }
        // Fetch results
        for(int i = 0;i < arr.length;i++) {
            if(hash[arr[i]] != -1) {
                System.out.println("Occurrence of "+arr[i]+" is "+hash[arr[i]]);
                hash[arr[i]] = -1;
            }
        }
    }

    public static void occurrenceUsingHashMap(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>();
        // Pre compute
        for (int i = 0; i < arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Fetching
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of element:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(occurance(3, arr));
        // occurrenceOptimal(arr);
        occurrenceUsingHashMap(arr);
        sc.close();
    }
}
