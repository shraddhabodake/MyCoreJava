import java.util.Scanner;

/**
 * Created by shraddha on 23/9/17.
 */
public class ArrayDemo
{

    void get()
    {
        int array[]=new int[5];
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter values..");
        for (int i=0;i<a;i++)
            {
                array[i]=sc.nextInt();
            }
        for (int i=0;i<a;i++)
            {
                System.out.println("Values are"+array[i]);
            }
    }
        public static void main(String[] args) {
        ArrayDemo ar=new ArrayDemo();
          ar.get();
    }
}
