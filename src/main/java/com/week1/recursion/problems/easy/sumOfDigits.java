public class sumOfDigits 
{
    public static void main(String[] args) 
    {
        int number = 1342;
        int ans = sumOfDigit(number);
        System.out.println(ans);
    }

    public static int sumOfDigit(int number)
    {
        if(number == 0)
        {
            return 0;
        }
        else
        {
            return sumOfDigits(number/10) + number%10;
        }
    }
}
