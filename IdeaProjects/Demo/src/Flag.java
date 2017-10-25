/**
 * Created by shraddha on 4/10/17.
 */
public class Flag
{
    public static void main(String[] args)
    {
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<4;j++)
            {
                System.out.print("* ");

            }
            for (int k=0;k<5;k++)
            {
                System.out.print("= ");
            }

            System.out.println(" ");

            for (int j=0;j<3;j++)
            {
                System.out.print(" *");
            }

            for (int k=0;k<5;k++)
            {
                System.out.print(" =");
            }
        System.out.println();
        }

//        for (int i=0;i<2;i++)
//        {
//            for (int j=0;j<3;j++)
//            {
//                System.out.print(" * ");
//            }
//            for (int k=0;k<5;k++)
//            {
//                System.out.print("= ");
//            }
//            System.out.println(" ");
//        }
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<9;j++)
            {
                System.out.print("= ");
            }
            System.out.println(" ");
        }
    }
}
