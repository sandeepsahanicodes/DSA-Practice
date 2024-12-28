import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int reverse = 0;
        int originalNumber = n;
        while(n != 0) {
            int lastDigit = n%10;
            n=n/10;
            reverse = (reverse*10) + lastDigit;
        }
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("The number is a palindrome number");
        } else {
            System.out.println("The number is not a palindrome number");
        }
        sc.close();
    }    
}
