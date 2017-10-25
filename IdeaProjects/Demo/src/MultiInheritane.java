import java.util.Scanner;

/**
 * Created by shraddha on 26/9/17.
 */


class Addition{
    int a,b,c;
    void add()
    {
        System.out.println("Enter the values:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Addition:"+c);
    }
}
class Substraction extends Addition
{
    void sub()
    {
        c=a-b;
        System.out.println("Substratction:"+c);
    }
}
public class MultiInheritane extends Substraction
{
    void mult()
    {
        c=a*b;
        System.out.println("Multiplication:"+c);
    }

    public static void main(String[] args)
    {
    MultiInheritane mi=new  MultiInheritane();
    mi.add();
    mi.sub();
    mi.mult();
    }
}
