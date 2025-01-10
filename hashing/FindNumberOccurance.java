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
    // Find the occurance of a number with using hashing.
    // Optimal approach
    // TC: O(N) -> For the entire array
    public static void occurrenceOptimal(int arr[]) {
        
        // Pre calculations
        int hash[] = new int[13];
        for(int i = 0;i < arr.length;i++) {
            hash[arr[i]] += 1;
        }
        // Fetch results
        for(int i = 0;i < arr.length;i++) {
            if(hash[arr[i]] != -1) {
                System.out.println("Occurrence of "+arr[i]+" is "+hash[arr[i]]);
                hash[arr[i]] = -1;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,2,3,4,5,6};
        // System.out.println(occurance(3, arr));
        occurrenceOptimal(arr);
    }
}
