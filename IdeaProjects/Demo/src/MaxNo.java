import java.util.Scanner;

/**
 * Created by shraddha on 4/10/17.
 */
public class MaxNo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Maximum No Is:"+a);
        }
       else if(b>a && b>c)
       {
         System.out.println("Maximum no is:"+b);
        }
        else {
            System.out.println("Maximum no is:"+c);
        }
    }
}
