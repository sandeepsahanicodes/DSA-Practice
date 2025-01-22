import java.util.Scanner;

public class IsSorted {
    // TC: O(n)
    // SC: O(1)
    public static boolean isSorted(int arr[]) { 
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i+1]) {
                
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
         
        if (isSorted(arr)) {
            System.out.println("Array is sorted!");
        } else {
            System.out.println("Array is not sorted!");
        }
        sc.close();
    }
}
