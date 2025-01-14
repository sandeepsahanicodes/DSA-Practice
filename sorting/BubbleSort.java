import java.util.Scanner;

public class BubbleSort {
    // TC: O(n^2) ~> Worse
    // TC: O(n) ~> Best
    public static void bubbleSort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if (didSwap == false) {
                break;
            }
            // System.out.println("Runs");
        }
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
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
