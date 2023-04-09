package main.java.com.week1.recursion.problems.easy;

public class ProductOfDigits 
{
    public static void main(String[] args) 
    {
        int number = 123;
        int ans = productOfDigits(number);
        System.out.println(ans);
    }

    public static int productOfDigits(int number)
    {
        if(number%10 == number)
        {
            return number;
        }
        else
        {
            return number%10 * productOfDigits(number/10);
        }
    }
}
