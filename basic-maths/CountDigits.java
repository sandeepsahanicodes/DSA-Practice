import java.util.Scanner;

public class CountDigits {
    // Time complexity: O(log10(n))
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
        sc.close();
    }
}
