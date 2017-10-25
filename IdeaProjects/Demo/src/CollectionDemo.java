import java.util.*;

/**
 * Created by shraddha on 12/10/17.
 */
public class CollectionDemo
{
    public static void main(String[] args)
    {
        System.out.println("LIST:");
        ArrayList<String> al=new ArrayList<>();
        al.add("pradnya");
        al.add("shraddha");
        al.add("pooja");
        al.add("ravi");
        al.add("ajay");
        for (String obj:al)
        {
            System.out.println(obj);
        }
        System.out.println("");
        System.out.println("LinkedList:");
        LinkedList<String> ll=new LinkedList<>();
        ll.add("pradnya");
        ll.add("shraddha");
        ll.add("pooja");
        ll.add("ravi");
        ll.add("ajay");
        for (String obj:ll)
        {
            System.out.println(obj);
        }
        System.out.println("");
        System.out.println("SET:");
        Set<String> s=new TreeSet<>();
        s.add("pradnya");
        s.add("shraddha");
        s.add("pooja");
        s.add("ravi");
        s.add("ajay");
        s.add("shraddha");
        s.add("pooja");
        for (String obj:s)
        {
            System.out.println(obj);
        }
        System.out.println("");
        System.out.println("HashSet:");
        HashSet<String> hs=new HashSet<>();
        hs.add("pradnya");
        hs.add("shraddha");
        hs.add("pooja");
        hs.add("ravi");
        hs.add("ajay");
        hs.add("shraddha");
        hs.add("pooja");
        for (String obj:hs)
        {
            System.out.println(obj);
        }
    }
}
