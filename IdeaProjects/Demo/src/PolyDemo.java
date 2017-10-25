/**
 * Created by shraddha on 28/9/17.
 */

class Rbi
{
    int rateOfInterest()
    {
        return 7;
    }
}
class Sbi extends Rbi
{
    int rateOfInterest()
    {
        return 6;
    }
}
class Bom extends Rbi
{
    int rateOfInterest()
    {
        return 5;
    }
}
class Bob extends Rbi
{
    int rateOfInterest()
    {
        return 4;
    }
}

public class PolyDemo extends Rbi
{
    public static void main(String[] args) {
        Rbi r=new Rbi();
        Sbi s=new Sbi();
        Bom m=new Bom();
        Bob b=new Bob();

        System.out.println("rate of interest of rbi:"+r.rateOfInterest());
        System.out.println("rate of interest of sbi:"+s.rateOfInterest());
        System.out.println("rate of interest of bom:"+m.rateOfInterest());
        System.out.println("rate of interest of bob:"+b.rateOfInterest());
    }
}
