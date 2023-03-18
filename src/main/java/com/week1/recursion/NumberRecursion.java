// Number example with recursion
class NumberRecursion
{
    public static void main(String args[])
    {
       print(1);
    }

    public static void print(int number)
    {
        if(number == 5)
        {
            System.out.println(5);
            return;
        }
        System.out.println(number);
        print(number+1);
    }
}