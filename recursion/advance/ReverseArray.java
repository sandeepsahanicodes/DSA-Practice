package advance;

public class ReverseArray {
    public static void swap(int[] arr, int start, int end) {
       
        // Swap the values
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        swap(arr, i, (n - i - 1));
        reverse(arr, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        reverse(arr, 0);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
