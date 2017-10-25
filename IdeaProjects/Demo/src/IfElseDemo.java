import java.util.Scanner;

/**
 * Created by shraddha on 22/9/17.
 */
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Enter the percentage:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<35)
        {
            System.out.println("Fail");
        }
        else if (a>=35 && a<60)
        {
            System.out.println("PASS");
        }
        else if (a>=60 && a<75)
        {
            System.out.println("First Class");
        }
        else if (a>=75 && a<=100)
        {
            System.out.println("Distinction");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
