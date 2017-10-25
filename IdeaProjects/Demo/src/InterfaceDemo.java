/**
 * Created by shraddha on 4/10/17.
 */
public interface InterfaceDemo
{
    void call();
    void msg();
    void games();
}
interface SecondDemo
{
    void call();
    void msg();
}
class MobileDemp implements InterfaceDemo,SecondDemo
{
    public void call()
    {
        System.out.println("calling");
    }
    public void msg()
    {
        System.out.println("message");
    }
    public void games()
    {
        System.out.println("playing games");
    }

    public static void main(String[] args)
    {
     InterfaceDemo i=new MobileDemp();
     SecondDemo s=new MobileDemp();
     i.call();
     s.call();
     i.msg();
     i.games();
    }
}
