package backtracking;


public class PrintOneToNBT {
    public static void printOneToN(int i, int n) {
        if(i < 1) {
            return;
        }
        printOneToN(i-1, n);
        System.out.print(i + " ");
    }
    public static void main(String[] args) {
        printOneToN(10, 10);
    }
}
