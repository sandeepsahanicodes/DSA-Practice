import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        int reverse = 0;
        while(n != 0) {
            int lastDigit = n%10;
            n=n/10;
            reverse = (reverse*10) + lastDigit;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("reversedNumber number of " + n + " is: " + reverseNumber(n));
        sc.close();
    }
}
