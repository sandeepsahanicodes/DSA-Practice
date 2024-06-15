import java.util.Scanner;
public class Patterns {
    // * * * * 
    // * * * * 
    // * * * * 
    // * * * * 
    static public void pattern1(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // * 
    // * * 
    // * * * 
    // * * * * 
    static public void pattern2(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 1 
    // 1 2 
    // 1 2 3 
    // 1 2 3 4 
    // 1 2 3 4 5 
    static public void pattern3(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // 1 
    // 2 2 
    // 3 3 3 
    // 4 4 4 4 
    static public void pattern4(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // * * * * 
    // * * * 
    // * * 
    // * 
    static public void pattern5(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1 
    static public void pattern6(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
//      *    
//     ***   
//    *****  
//   ******* 
//  *********
    static public void pattern7(int row) {
        for (int i = 0; i < row; i++) {
            // For a row
            // Space
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2*i + 1 ; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < row-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int t,row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases:");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter row for test case"+(i+1) +":");
            row = sc.nextInt();
            pattern7(row);
        }
    }
}
