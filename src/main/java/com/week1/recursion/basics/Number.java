package main.java.com.week1.recursion.basics;
// Write a function which takes in a number and print it.
// Print first five number: 1 2 3 4 5
public class Number
{
    public static void main(String[] args) 
    {
        print(1);
    }

    static void print(int n)
    {
        System.out.println(n);
        print1(2);
    }

    static void print1(int n)
    {
        System.out.println(n);
        print2(3);
    }

    static void print2(int n)
    {
        System.out.println(n);
        print3(4);
    }

    static void print3(int n)
    {
        System.out.println(n);
        print4(5);

    }

    static void print4(int n)
    {
        System.out.println(n);

    }

}

