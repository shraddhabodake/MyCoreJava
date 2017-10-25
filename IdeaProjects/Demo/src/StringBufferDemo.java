/**
 * Created by shraddha on 10/10/17.
 */
public class StringBufferDemo
{
   static double t1;
   static long t2;
   static void usingString()
    {
        String s="codekul";
        System.out.println(s.hashCode());
        for (int i=0;i<=200000;i++)
        {
         s.concat("institute");
        }
        System.out.println(s.hashCode());
    }
   static void usingBufferstring()
    {
        StringBuffer s=new StringBuffer("codekul");
        System.out.println(s.hashCode());
        for (int i=0;i<=200000;i++)
        {
            s.append("institute");
        }
        System.out.println(s.hashCode());
    }

    public static void main(String[] args)
    {
    t1=System.currentTimeMillis();
    StringBufferDemo.usingString();
    System.out.println("Time for String:"+(System.currentTimeMillis()-t1)+"ms");
    t2=System.currentTimeMillis();
    StringBufferDemo.usingBufferstring();
    System.out.println("Time for StringBuffer:"+(System.currentTimeMillis()-t2)+"ms");
    }
}
