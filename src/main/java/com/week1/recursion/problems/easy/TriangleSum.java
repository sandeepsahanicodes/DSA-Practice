import java.util.Arrays;
public class TriangleSum
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        triangleSum(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void triangleSum(int arr[])
    {
        // No element in the array.(Base condition)
        if(arr.length < 1)
        {
            return;
        }
        
        int [] temp = new int[arr.length - 1];
        for(int i=0;i<arr.length-1;i++)
        {
            int sum = arr[i] + arr[i+1];
            temp[i] = sum;
        }
        triangleSum(temp);
        System.out.println(Arrays.toString(temp));

    }
}