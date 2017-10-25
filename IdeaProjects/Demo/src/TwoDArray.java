import java.util.Scanner;

/**
 * Created by shraddha on 3/10/17.
 */
public class TwoDArray {
    int array[][]={{1,2,3},{4,5,6},{7,8,9}};
    void get()
    {
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }

    }
    void array1()
    {
        int b,d,r,c;
        System.out.println("enter array size:");
        Scanner sc=new Scanner(System.in);
         b=sc.nextInt();
         d=sc.nextInt();
        int arr[][]=new int[b][d];
        for (int i=0;i<b;i++)
        {
          for (int j=0;j<d;j++)
          {
              System.out.println("row "+i+"\tcol "+j+"=");
              System.out.println(arr[i][j]=sc.nextInt());
          }
        }
        for(int i=0;i<b;i++)
        {
            for (int j=0;j<d;j++)
            {

                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        TwoDArray t=new TwoDArray();
        t.get();
        t.array1();
    }
}
