/**
 * Created by shraddha on 3/10/17.
 */
public class OneDarray
{
    int array1[]={6,7,8,9,0};
    void get()
    {
        //Enhance for loop
        for (int i:array1)
        {
            System.out.println("Array1="+i);
        }
    }
    public static void main(String[] args)
    {
        OneDarray o=new OneDarray();
        o.get();
        int array2[]={1,2,3,4,5};
        for(int i=0;i<5;i++)
        {
            System.out.println("Array2="+array2[i]);
        }
    }
}

