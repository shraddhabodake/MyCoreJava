import java.util.Scanner;

/**
 * Created by shraddha on 5/10/17.
 */
public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String name=sc.nextLine();
        char a[]=name.toCharArray();
        for (int i=name.length()-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}
