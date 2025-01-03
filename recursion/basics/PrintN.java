package basics;
// When a function calls itself, it is called recursion.
// Print numbers from 1 to N using recursion.

public class PrintN {
    static void printN(int n) {
        if(n == 0) {
            return;
        }
        printN(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printN(10);
    }
}
