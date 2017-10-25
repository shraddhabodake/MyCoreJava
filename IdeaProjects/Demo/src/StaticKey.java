/**
 * Created by shraddha on 25/9/17.
 */
public class StaticKey
{
    static int rollno;
    static String studentname;
    static String instituet="codekul";


    StaticKey(int id, String name)
    {
        rollno=id;
        studentname=name;
    }
    static
    {
        display();
        System.out.println("Start");
        System.out.println(instituet.hashCode());
    }
    static void display()

    {
        System.out.println("id:"+rollno+"\tname:"+studentname+"\tinstituet:"+instituet);
    }
    public static void main(String[] args)
    {
        StaticKey sk=new StaticKey(1,"pradnya");
        StaticKey sk1=new StaticKey(2,"shraddha");
       // sk.display();
       // sk1.display();
        StaticKey.display();
         System.out.println(instituet.hashCode());
    }
}
