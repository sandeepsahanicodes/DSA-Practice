package basics;
import java.util.Scanner;

public class SumTillN {
    // Parameterized method
    public static void sumTillN(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumTillN(i-1, sum + i);
    }
    
    // Non-parameterized method
    public static int sumTillN(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumTillN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sumTillN(n, 0);
        // System.out.println("Sum of numbers till " + n + " is: " + sumTillN(n, 0));
        System.out.println("Sum of numbers till " + n + " is: " + sumTillN(n));
    }
}
