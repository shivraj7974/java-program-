public class Pyramid
{
    public static void inverted_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=n-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        inverted_pyramid(4);
    }
}