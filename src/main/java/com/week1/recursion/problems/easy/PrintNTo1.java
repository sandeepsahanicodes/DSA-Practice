// Prints numbers from n to 1
package main.java.com.week1.recursion.problems.easy;

public class PrintNTo1 
{
    public static void main(String[] args) 
    {
        // print1ToN(5);
        // printNTo1(5);
        print1ToNAndNTo1(5);
    }

    public static void printNTo1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
        
    }

    public static void print1ToN(int n)
    {
        if(n == 0)
        {
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
        
    }

    public static void print1ToNAndNTo1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        print1ToNAndNTo1(n-1);
        System.out.println(n);
        
    }

    
}
