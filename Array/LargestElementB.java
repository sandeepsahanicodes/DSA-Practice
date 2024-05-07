
// Brute Force Approach
/**
 * 
 * Step 1: Sort the array in assending
 * Step 2: largest = arr[n-1]
 * 
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
*/

import java.util.Arrays;
class LargestElementB {
    static int findLargestElement(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int arr[] = {6,5,7,4,2,6,7,90};
        System.out.println(findLargestElement(arr));
    }
}
