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
        public static void pattern14A(int row) {
 
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

        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        public static void pattern14B(int row) {
 
            for (int i = 0; i < row; i++) {
                
                for (char ch = 'A'; ch <= 'A'+ i; ch++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
             }
        }
        
        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
        public static void pattern15(int row) {
 
            for (int i = 0; i < row; i++) {
                
                for (char ch = 'A'; ch <= 'A'+ (row-i-1); ch++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
             }
        }
        // A 
        // B B 
        // C C C 
        // D D D D 
        // E E E E E 
        public static void pattern16(int row) {
            for (int i = 0; i < row; i++) {
                char ch = (char)('A' + i);
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch+" ");
                }
                System.out.println();
             }
        }
    //      A    
    //     ABA   
    //    ABCBA  
    //   ABCDCBA 
    //  ABCDEDCBA
        public static void pattern17(int row) {
            for (int i = 0; i < row; i++) {
                int space = row - i - 1;
                // Space
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                // Character accending
                for (char cha = 'A'; cha <= 'A'+ i; cha++) {
                    System.out.print(cha);
                }
                //character decending
                for (char chd = (char)('A'+ i - 1); chd >= 'A'; chd--) {
                    System.out.print(chd);
                }
                // Space
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                System.out.println();
             }
        }

        public static void pattern18(int row) {
            char initChar;
            for (int i = 0; i < row; i++) {
                initChar = (char)('E'-i);
                for (char ch= initChar; ch <= 'E' ; ch++) {
                    System.out.print(ch+" ");
        
                }
                System.out.println();
             }
        }
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // Works for even rows only.(Partially correct.)
        public static void pattern19A(int row) {
            int space,stars;
            for (int i = 0; i < row; i++) {
                
                if(i<=(row/2)-1) {
                    space = 2*i; 
                    stars = (row/2) - i;               
                } else {
                    space = 2*(row - i) - 2;
                    stars = i - (row/2) + 1;
                }
                
                // Stars
                for (int j = 0; j < stars ; j++) {
                    System.out.print("*");
                }
                // Space
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 0; j < stars ; j++) {
                    System.out.print("*");
                }
                System.out.println();
             }
            
        }
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // Works for even/odd rows.(Fully correct)
        public static void pattern19B(int row) {
            int initalSpace = 0;
            for (int i = 0; i < row; i++) {
                // Stars
                for (int j = 0; j < row-i ; j++) {
                    System.out.print("*");
                }
                // Space
                for (int j = 0; j < initalSpace; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 0; j < row-i ; j++) {
                    System.out.print("*");
                }
                initalSpace += 2;
                System.out.println();
             }
             initalSpace = 2*row - 2;
             for (int i = 0; i < row; i++) {
                // Stars
                for (int j = 0; j <= i ; j++) {
                    System.out.print("*");
                }
                // Space
                for (int j = 0; j < initalSpace; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 0; j <= i ; j++) {
                    System.out.print("*");
                }
                initalSpace -= 2;
                System.out.println();
             }
        }
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      ** 
        // *        *
        public static void pattern20(int row) {
            int space,stars;
            space = 2*row-2;
            for (int i = 1; i <= 2*row-1; i++) {
                stars = i;
                if(i > row) {
                    stars = 2*row - i;        
                }
                // Stars
                for (int j = 1; j <= stars ; j++) {
                    System.out.print("*");
                }
                // Space
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 1; j <= stars ; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if (i < row) {
                    space -= 2;
                } else {
                    space += 2;
                }
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
            pattern20(row);
        }
    }
}
