import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;

public class FindAllFactors {
    // Time complexity: O(n)
    // Not optimal solution
    public static void getAllDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // Optimal solution
    // Time complexity: O(sqrt(n))
    public static void getAllDivisorOptimal(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n/i) {
                    factors.add(n/i);
                }
            }
        }
        Collections.sort(factors);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       
        // System.out.println("All factors of " + n + " are: ");
        // getAllDivisor(n);
        System.out.println("All factors of " + n + " are: ");
        getAllDivisorOptimal(n);
        sc.close();
    }
}
