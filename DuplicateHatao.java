public class DuplicateHatao {
    public static void rd(string sts,int idx,StringBuilder newstr,boolean map[])
    {
        if(idx==str.length())
    {
        System.out.println(newstr);
        return ;
    }
    char currchar=str.charAt(idx);
    if(map[currchar-'a']==true)
    {
        rd(sts, idx+1, newstr, map);
    }
    else{
        map[currchar-'a']=true;
        rd(sts, idx+1, newstr.append(currchar), map);
    }
    }
    public static void main(String args[])
    {
        String str = "appnnacollege";
        rd(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
