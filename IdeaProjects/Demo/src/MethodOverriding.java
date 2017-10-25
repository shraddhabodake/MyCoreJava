/**
 * Created by shraddha on 28/9/17.
 */

class Overriding
{
 void show()
 {
     int a=10, b=20,c;
     c=a+b;
     System.out.println("Addition:"+c);
 }
}
public class MethodOverriding extends Overriding
{
    void show()
    {
        int a = 20, b = 30,c;
        c=a+b;
        System.out.println("\nAddtion2:"+c);
    }

    public static void main(String[] args) {
        MethodOverriding m=new MethodOverriding();
        m.show();
    }
}
