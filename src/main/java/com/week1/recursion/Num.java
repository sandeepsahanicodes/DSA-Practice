class Num
{
    public static void main(String[] args) 
    {
        System.out.println(sum(3));

    }

    public static int sum(int num)
    {
       if(num == 1)
       {
           return 1;
       }
       else
       {
           return sum(num-1) + sum(num-2);
       }
    }
}
