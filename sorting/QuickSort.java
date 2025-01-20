
import java.io.*;
import java.util.*;

class QuickSort {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low < high) {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot - 1);
            quickSort(arr,pivot + 1,high);
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i < j) {
            while(arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            
            while(arr[j] > pivot && j >= low + 1) {
                j--;
            }
            
             // Swap arr[i] and arr[j]
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        
        // Swap arr[low] and arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
