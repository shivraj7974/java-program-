import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer");
        int digits=sc.nextInt();
        System.out.println("the sum is = "+SumDigits(digits));
    }
    public static int SumDigits(int n)
    {
        int sumofdigits=0;
        while(n>0)
        {
            int ld=n%10;
            sumofdigits=sumofdigits+ld;
            n=n/10;
        }
        return sumofdigits;
    }
}