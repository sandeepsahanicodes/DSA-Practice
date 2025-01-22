import java.util.Arrays;
import java.util.Scanner;

public class LagestElement {
    
    // Brute force approach
    // TC: O(nlogn)
    // SC: O(1)
    static int findLargestElementBf(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    // Optimal approach
    // TC: O(n)
    // SC: O(1)
    static int findLargestElementO(int arr[]){
        int largest = arr[0]; 
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] > largest) {
                 largest = arr[i];
             }
         }
         return largest;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("largest element is " + findLargestElementBf(arr));
        System.out.println("largest element is " + findLargestElementO(arr));
        
        sc.close();
    }
}
