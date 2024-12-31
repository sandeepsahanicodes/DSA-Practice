import java.util.Scanner;
public class PrintNToOne {
    public static void printNToOne(int i, int n) {
        if(i < 1) {
            return;
        }
        System.out.print(i + " ");
        printNToOne(i-1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        printNToOne(n, n);
    }
}
