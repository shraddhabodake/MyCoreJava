import java.util.Scanner;

/**
 * Created by shraddha on 28/9/17.
 */
public class Swap
{

    int a,b;
    Swap()
    {
        System.out.println("Swaping without using Temporary variable");
        System.out.println("Enter two no: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Value of a:"+a+"\tvalue of b:"+b);
        System.out.println("After Swaping:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a:"+a+"\tvalue of b:"+b);
    }

    public static void main(String[] args)
    {
        Swap s=new Swap();
    }
}
