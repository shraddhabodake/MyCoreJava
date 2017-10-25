import java.util.Scanner;

/**
 * Created by shraddha on 22/9/17.
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multipliaction");
        System.out.println("4.Division");
        System.out.println("5.Mod");
        System.out.println("Enter the Choice:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         System.out.println("Enter the values:");
        int b = sc.nextInt();
        int c = sc.nextInt();

        switch (a) {
            case 1:
                a=b+c;
                System.out.println("Addition is:"+a);
                break;

            case 2:
                a=b-c;
                System.out.println("substraction is:"+a);
                break;

            case 3:
                a=b*c;
                System.out.println("Multiplication is:"+a);
                break;

            case 4:
                a=b/c;
                System.out.println("Division is:"+a);
                break;

            case 5:
                a=b%c;
                System.out.println("mod is:"+a);
                break;

            default:
                break;

        }
       if(a%2==0)
               {
                   System.out.println(a+" is even no");
               }
               else{
                   System.out.println(a+" is odd no");
               }


    }
}