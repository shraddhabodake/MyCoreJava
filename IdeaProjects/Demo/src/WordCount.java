import java.util.Scanner;

/**
 * Created by shraddha on 10/10/17.
 */
public class WordCount
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String s=sc.nextLine();
        int Count=1;
        for (int i=0;i<s.length()-1;i++)
        {

            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
            {
                Count++;
            }
        }
        System.out.println("Number of words in a string="+Count);


    }
}
