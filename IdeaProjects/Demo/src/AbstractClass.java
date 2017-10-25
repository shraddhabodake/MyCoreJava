/**
 * Created by shraddha on 4/10/17.
 */
abstract class Mobile
{
    abstract void call();
    abstract void msg();
    void games()
    {
        System.out.println("playing games");
    }
}
class CellPhone extends Mobile
{
 void call()
 {
     System.out.println("calling");
 }
    void msg()
    {
        System.out.println("messeging");
    }
}
public class AbstractClass extends CellPhone
{
    public static void main(String[] args)
    {
     Mobile m=new AbstractClass();
     m.call();
     m.msg();
     m.games();
    }
}
