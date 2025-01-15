import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
    
    public static void merge(int arr[], int l, int mid, int r) {
        List<Integer> temp = new ArrayList<>();
        int left = l;
        int right = mid + 1;
        while(left<=mid && right<=r) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else{
                 temp.add(arr[right]);
                 right++;
            }
        }
        
        while(left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        
         while(right<=r) {
            temp.add(arr[right]);
            right++;
        }
        
        for(int i = l;i<= r;i++) {
            arr[i] = temp.get(i - l);
        }
    }
    // TC: O(nlog2n)
    // SC: O(n)
    public static void mergeSort(int arr[], int l, int r) {
        // code here
        if(l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
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
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
