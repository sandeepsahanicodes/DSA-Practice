// Arrays class is a final class in java.util package. It provides static methods to work with arrays.

package arrays;
import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5,6,7,8,9,10};

        // Perform binary search on the array
        // binarySearch() method returns the index of the element if it is present in the array
        int index = Arrays.binarySearch(numbers, 0);
        System.out.println(index);

        int unsortedNumbers[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // Sort the array
        Arrays.sort(unsortedNumbers);
        System.out.println(Arrays.toString(unsortedNumbers));

        // Fill the array with a specific value
        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(numbers));
    }
}