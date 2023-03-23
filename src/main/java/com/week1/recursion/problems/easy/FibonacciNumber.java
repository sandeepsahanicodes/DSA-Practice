// Find the nth fibonacchi number.
public class FibonacciNumber 
{
    public static void main(String[] args) 
    {
        int nthTerm = 4; 
        int ans = fibonacci(nthTerm);
        System.out.println("The "+nthTerm+"th fibonacci number is "+ans);
    }

    public static int  fibonacci(int n)
    {
        // Base condition
        if(n < 2)
        {
           return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
