import java.util.Scanner;

public class Solution {
    public static int sumArr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    } 
    
    public static int findMinimumValue(int arr[]) {
        int sum = sumArr(arr);
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            int minSum = 0;
            minSum = arr[i] * arr.length;
            if(minSum > sum) {
                value = arr[i];
                break;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int updatedValue = findMinimumValue(arr);
        System.out.println(updatedValue);
    }
}
