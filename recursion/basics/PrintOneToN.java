package basics;
import java.util.Scanner;

public class PrintOneToN {
    // Time complexity: O(n)
    // Space complexity: O(n)
    static void printName(int i,int n) {
        if(i > n) {
            return;
        }
        System.out.print(i + " ");
        printName(i+1,n);
    }
    public static void main(String[] args) {
       int i = 1;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
       printName(i,n);
    }
}
