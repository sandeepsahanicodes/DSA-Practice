/**
 * Optimal Approach
 * 
 * Step 1: set largest = arr[0]
 * Step 2: compare largest with all element
 * Step 3: if largest<arr[i] then largest = arr[i]
 * Step 4: return largest.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LagestElementO {
    static int findLargestElement(int arr[]){
        int largest = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
             if(largest<arr[i]) {
                 largest = arr[i];
             }
         }
         return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,8,9,43,33};
        System.out.println(findLargestElement(arr));
    }
}
