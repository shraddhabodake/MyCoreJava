

/**
 * Created by shraddha on 21/9/17.
 */
public class ConstructorDemo {
    void show()
    {
        System.out.println("hiii");
    }
   ConstructorDemo()

    {
        System.out.println("in default cotructor");
    }
   ConstructorDemo(int a, int b)
  {
   int c=a+b;
      System.out.println("addition of a and b is:"+c);
  }

    public static void main(String[]args)

    {
        ConstructorDemo constructorDemo=new ConstructorDemo();
        ConstructorDemo constructorDemo1=new ConstructorDemo(10,20);
        constructorDemo.show();
    }}
