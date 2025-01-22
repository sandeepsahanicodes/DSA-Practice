import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    // Brute force approach
    // TC: O(nlogn) + O(n)
    // SC: O(1)
    // O(nlogn) for sorting
    // O(n) for reverse traversal
    public static int secondLargestBf(int arr[]) {
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secondLargest = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    // Better approach
    // TC: O(n) + O(n)
    // SC: O(1)
    // O(n) for finding largest
    // O(n) for finding second largest
    public static int secondLargestB(int arr[]) {
        int largest = arr[0];
        int secondLargest = -1; // Keep this Integer.MIN_VALUE if array contains negative values
        
        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // Optimal approach
    // TC: O(n)
    public static int secondLargestO(int arr[]) {
        int largest = arr[0];
        int secondLargest = -1; // Keep this Integer.MIN_VALUE if array contains negative values
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        // int sl = secondLargestBf(arr);
        // int sl = secondLargestB(arr);
        int sl = secondLargestO(arr);
        
        if (sl != -1) {
            System.out.println(sl);
        } else {
            System.out.println("Second largest doesn't exists!");
        }
        sc.close();
    }
}
