public class RecursionBasics3 {
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int fnm1= fact(n-1);
        int fn=n+fact(n-1);
        return fn;
    }
    public static void main(String args[])
    {
        int n=5;
        System.out.println(fact(n));
    }
}
