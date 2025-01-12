import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for(int j = i;j<= n-1;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            // Swap arr[i] and arr[min] index
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
            }
            
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
        selectionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
