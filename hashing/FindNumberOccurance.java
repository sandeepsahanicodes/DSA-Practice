public class FindNumberOccurance {
    // Find the occurance of a number without using hashing.
    // Brute force approach
    // TC: O(N) -> For a single element
    // TC: N * O(N) -> For the entire array
    public static int occurance(int number, int arr[]) {
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == number) {
                count++;
            }
        }
        return count;
    } 
    
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,4,3,4,4,5};
        System.out.println(occurance(3, arr));
    }
}
