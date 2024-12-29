import java.util.Scanner;

public class computeGcd {
    // Time complexity: O(min(a,b))
    public static int computeGcd(int a, int b) {
        int gcd = 1;
        for(int i = 1; i <= Math.min(a,b);i++) {
            if(a%i == 0 && b%i == 0) {
            gcd = i; 
        }
       }
       return gcd;
    }
    // Worse Time complexity: O(min(a,b))
    // Best Time complexity: O(1)
    public static int computeGcdOptimal(int a, int b) {
        int gcd = 1;
        for(int i = Math.min(a,b); i >= 1 ;i--) {
            if(a%i == 0 && b%i == 0) {
            gcd = i;
            break;
        }
       }
       return gcd;
    }
    // Euclidean algorithm
    // Time complexity: O(log(min(a,b)))
    public static int computeGcdEuclidean(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
            return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " is: " + computeGcd(a,b));

        System.out.println("GCD of " + a + " and " + b + " is: " + computeGcdOptimal(a,b));

        System.out.println("GCD of " + a + " and " + b + " is: " + computeGcdEuclidean(a,b));
    }
}
