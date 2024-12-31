import java.util.Scanner;

public class SumTillN {
    public static void sumTillN(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumTillN(i-1, sum + i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sumTillN(n, 0);
        // System.out.println("Sum of numbers till " + n + " is: " + sumTillN(n, 0));
    }
}
