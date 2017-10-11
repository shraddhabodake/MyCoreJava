import java.util.Scanner;

/**
 * Created by shraddha on 6/10/17.
 */
public class Prime
{
    public static void main(String[] args)
    {
        int m,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int a=sc.nextInt();
       m=a/2;
       for (int i=2;i<=m;i++)
       {
           if (a%i==0)
           {
               System.out.println("Number is not prime:");
               flag=1;
               break;
           }
       }
       if (flag==0)
       {
           System.out.println("Number is prime");
       }

    }
}
