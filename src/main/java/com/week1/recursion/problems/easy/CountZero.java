package main.java.com.week1.recursion.problems.easy;

public class CountZero {
    public static void main(String[] args) {
        int count = count(101010);
        // int count = 10;
        System.out.println(count);
    }

    static public int count(int number)
    {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == 0) {
               count++;
            }
            number /= 10;
         }
        return count;
    }
}
