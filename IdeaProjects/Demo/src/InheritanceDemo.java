import java.util.Scanner;

/**
 * Created by shraddha on 26/9/17.
 */
//Single Inheritance
class Parent
{
    int a,b,c;

    void show()
    {
        System.out.println("enter no");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
    }
}
public class InheritanceDemo extends Parent
{
    void display()
    {
        System.out.println("addition of two no:"+c);
    }
    public static void main(String[] args)
    {
        InheritanceDemo inheritanceDemo = new InheritanceDemo();
        inheritanceDemo.show();
        inheritanceDemo.display();
    }
}