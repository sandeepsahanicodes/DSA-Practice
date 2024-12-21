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
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // *
    // ***
    // *****
    // *******
    // *********
    static public void pattern7(int row) {
        for (int i = 0; i < row; i++) {
            // For a row
            // Space
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // *********
    // *******
    // *****
    // ***
    // *
    static public void pattern8(int row) {

        for (int i = 0; i < row; i++) {
            // For a row
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * row - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // *
    // ***
    // *****
    // *******
    // *********
    // *********
    // *******
    // *****
    // ***
    // *
    static public void pattern9(int row) {
        pattern7(row);
        pattern8(row);
    }

    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static public void pattern10(int row) {
        for (int i = 1; i <= 2 * row - 1; i++) {
            int stars = i;
            if (i > row) {
                stars = 2 * row - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    // 1 
    // 0 1 
    // 1 0 1 
    // 0 1 0 1 
    // 1 0 1 0 1 
    static public void pattern11(int row) {
        int start = 1;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    // 1        1
    // 12      21
    // 123    321
    // 1234  4321
    // 1234554321
        static public void pattern12(int row) {
            int space = 2*(row-1);
            
            for (int i = 1; i <=row; i++) {
                // Accending Number
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Space
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                   
                 // Decending Number
                 for (int j = i; j > 0; j--) {
                    System.out.print(j);
                 }
                 System.out.println();
                 space -= 2;
            }
        }
        // 1 
        // 2 3 
        // 4 5 6 
        // 7 8 9 10 
        // 11 12 13 14 15 
        public static void pattern13(int row) {
            int number = 1; 
            for (int i = 1; i <=row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
             }
        }
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        public static void pattern14(int row) {
 
            int characterIntValue = 65;
            for (int i = 1; i <=row; i++) {
                characterIntValue = 65;
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)characterIntValue + " ");
                    characterIntValue++;
                }
                System.out.println();
             }
        }

    public static void main(String[] args) {
        int t, row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases:");
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter row for test case" + (i + 1) + ":");
            row = sc.nextInt();
            pattern14(row);
        }
    }
}
