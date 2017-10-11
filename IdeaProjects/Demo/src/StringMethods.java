/**
 * Created by shraddha on 9/10/17.
 */
public class StringMethods
{
    void trim()
    {
        String s="codekul";
        String p=s.concat("pune");
        //String s1=p.concat("pune");
        System.out.println("Trim Method:-"+s.trim()+"institute");
        System.out.println("Concat Method:-"+p);
    }
    void equals()
    {
        String s1="Shraddha";
        String s2="Pradnya";
        String s3="Shraddha";
        System.out.println("Equals Method:-");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
    void valueOf()
    {
        int value=30;
        String s1=String.valueOf(value);
        System.out.println("ValueOf Method:-");
        System.out.println(s1+10);//concatenating string with 10
    }


    public static void main(String[] args)
    {
        StringMethods sm=new StringMethods();
        sm.trim();
        sm.equals();
        sm.valueOf();
    }
}
