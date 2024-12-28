import java.util.Scanner;

public class PrimeNumber {
    // Time complexity: O(n)
    // Not optimal solution
    public static boolean isPrime(int n) {
        if (n < 2 ) {
            return false;
        }
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }
        sc.close();
    }
}
