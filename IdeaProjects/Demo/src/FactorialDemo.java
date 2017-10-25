import java.util.Scanner;

/**
 * Created by shraddha on 13/10/17.
 */
public class FactorialDemo
{
    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
      //  int num=5;
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
