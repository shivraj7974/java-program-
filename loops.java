import java.util.*;
public class loops
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println("n is prime number");
        }
        else
        {
            boolean isPrime=true;
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;

                }
            }
            if(isPrime==true)
            {
                System.out.println("n is prime");
            }
            else
            {
                System.out.printl5n("n is not prime ");
            }
        }
    }
}
    