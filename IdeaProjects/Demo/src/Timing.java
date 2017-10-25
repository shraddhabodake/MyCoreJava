import java.util.Scanner;

/**
 * Created by shraddha on 4/10/17.
 */
public class Timing
{
    public static void main(String[] args)
    {
        int x,y,z,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds:");
        int a=sc.nextInt();

        x=a/60;

        y=x/60;
        z=x%60;

        s=a%60;

        System.out.println(y+":"+z+":"+s);

    }
}
