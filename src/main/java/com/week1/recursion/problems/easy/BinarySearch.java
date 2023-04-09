package main.java.com.week1.recursion.problems.easy;

// Implementation of binary search algorithm using recursion.
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target, 0, nums.length - 1));
    }
    static public int search(int[] nums, int target, int start, int end) 
    {
        if(start<=end)
        {
            int mid = start + (end-start)/2;

            if(nums[mid]==target)
            {
               return mid;
            }

            if(nums[mid]<target)
            {
                return search(nums, target, mid+1, end);
            }
             
            return search(nums, target, start, mid-1);
        }

        return -1;
    } 
}

