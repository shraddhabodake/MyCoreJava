/**
 * Created by shraddha on 3/10/17.
 */
public class TwoD
{
    int array[][]={{1,2,3},{4,5,6},{7,8,9}};
    void arr()
    {
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoD t=new TwoD();
        t.arr();
    }
}


