public class reverseNumber 
{
    public static void main(String[] args) 
    {
        int number = 1024;
        reverse(number);
    }

    public static void reverse(int number)
    {
        if (number < 10) {
            System.out.println(number);
            return;
        }
 
        else {
 
            // print the unit digit of the given number
            System.out.print(number % 10);

            reverse(number / 10);
        }
    }
}
