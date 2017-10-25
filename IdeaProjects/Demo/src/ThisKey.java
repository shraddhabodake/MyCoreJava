/**
 * Created by shraddha on 26/9/17.
 */
public class ThisKey
{
    int id;
    String name;

    ThisKey()
    {
        this(1,"paree");
    }

    ThisKey(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    void show(ThisKey t)
    {
        System.out.println("id:"+id+"\tname:"+name);
    }
    void get()
    {
        show(this);
    }

    public static void main(String[] args)
    {
        ThisKey thisKey=new ThisKey(1,"paree");
        thisKey.show(thisKey);
        //thisKey.get();
    }
}
