// Find the array is sorted or not.
// package main.java.com.week1.recursion.arrays;

public class IsArraySorted
{
    /**
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        int arr [] = {4,5,6,7,8,2};
        System.out.println(isSorted(arr));
    }
    
    /**
     * 
     * 
     * @param arr
     * @return
    */
    public static boolean isSorted(int arr[])
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}