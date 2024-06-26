public class StringJava
{
    pubilc static void Printletters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        String FirstName="shivraj";
        String LastName="Singh";
        String FullName=FirstName+" "+LastName;
        Printletters(FullName);
    }
}