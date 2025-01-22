import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    // Brute force approach
    // TC: O(logn) + O(n)
    // SC: O(n)
    public static int removeDuplicateBf(int arr[]) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int i = 0;
        for (Integer integer : set) {
            arr[i] = integer;
            i++;
        }
        return set.size();
    }

    // Optimal approach
    // TC: O(n)
    // SC: O(1)
    public static int removeDuplicateO(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        int uniqeCount = removeDuplicateO(arr);
        System.out.println("Uniqe elements are "+uniqeCount);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
