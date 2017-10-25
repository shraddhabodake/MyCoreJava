/**
 * Created by shraddha on 28/9/17.
 */
class Poly
{
    void show()
    {
        System.out.println("In default method:");
    }
    void show(int id)
    {
        System.out.println("In parameterised method:");
        System.out.println("\tid:"+id);
    }
    void show(int rollno, String name)
    {
        System.out.println("rollno:"+rollno+"\tname:"+name);
    }
}
public class MethodOverloading2 {
    public static void main(String[] args) {
        Poly p=new Poly();
        p.show();
        p.show(10);
        p.show(20,"shraddha");
    }
}
