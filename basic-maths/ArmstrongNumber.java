import java.util.Scanner;
public class ArmstrongNumber {
    public static int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        // int digitCount = (int) Math.log10(n) + 1; // Another way to find the number of digits
        int digitCount = digitCount(n);
        while (n > 0) {
            int lastDigit = n%10;
            sum += Math.pow(lastDigit, digitCount);
            n = n/10;
        }
        return originalNumber == sum;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
