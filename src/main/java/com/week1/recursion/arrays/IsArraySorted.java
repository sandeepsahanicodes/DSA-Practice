// Find the array is sorted or not.
 package main.java.com.week1.recursion.arrays;
 import java.util.Arrays;

/**
 */
public class IsArraySorted
{
    
    public static void main(String[] args) 
    {
        int arr [] = {4,5,6,7,8};
        System.out.println(isSorted(arr, arr.length));
    }


    // Iterative Approach.

    // public static boolean isSorted(int arr[])
    // {
    //     for(int i = 0;i<arr.length-1;i++)
    //     {
    //         if(arr[i]>arr[i+1])
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // Recursive approach.
    /**
     * 
     * @param arr
     * @param n
     * @return
     */

    public static boolean isSorted(int[] arr, int n) {
        // Base case: If there is only one element in the array, it is sorted
        if (n == 1) {
            return true;
        }
    
        // Recursive case: Check if the first element is smaller than or equal to the second element
        // and recursively call the function on the rest of the array
        return (arr[0] <= arr[1] && isSorted(Arrays.copyOfRange(arr, 1, n), n-1));
    }
    
}