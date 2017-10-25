import java.util.Scanner;

/**
 * Created by shraddha on 22/9/17.
 */
public class OddEvenDemo
{
    public static void main(String[] args)
    {
        System.out.println("enter the value:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
}
