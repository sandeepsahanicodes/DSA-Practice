package backtracking;
import java.util.Scanner;

public class PrintNToOneBT {
    public static void printNToOne(int i, int n) {
        if(i > n) {
            return;
        }
        printNToOne(i+1, n);
        System.out.print(i + " ");        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printNToOne(1, n);
        
    }
}
