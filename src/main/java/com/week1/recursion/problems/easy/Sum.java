public class Sum 
{
    public static void main(String[] args) 
    {
        int number = 100;
        int ans = sum(number);
        System.out.println(ans);
    }

    public static int sum(int number)
    {
        if(number<2)
        {
            return number;
        }
        else
        {
            return number+sum(number-1);
        }
    }
}
