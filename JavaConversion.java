public class JavaConversion
{
    public static void btd(int binNum)
    {
        int mynum=binNum;
        int pow=0;
        int decnum=0;
        while(binNum>0)
        {
            int ld =binNum%10;
            decnum=decnum+(ld*(int )Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of       "+mynum+"  =     "+decnum);
    }
    public static void main(String args[])
    {
        btd(1111);
    }
}