/**
 * Created by shraddha on 27/9/17.
 */
public class AggregationDemo
{
    int id;
    String name;
    AggregationDemo(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}
class AggregationSecond
{
    String address;
    String state;

    AggregationSecond(String address, String state)
    {
        this.address=address;
        this.state=state;
    }
}
class AggregationThird
{
    int phone;

    AggregationThird(int phone)
    {
        this.phone=phone;
    }
}

class Student
{
    String city;
    int zipcode;
    AggregationDemo aggregationDemo;
    AggregationSecond aggregationSecond;
    AggregationThird aggregationThird;

    Student(String city, int zipcode, AggregationDemo aggregationDemo, AggregationSecond aggregationSecond, AggregationThird aggregationThird)
    {
        this.city=city;
        this.zipcode=zipcode;
        this.aggregationDemo=aggregationDemo;
        this.aggregationSecond=aggregationSecond;
        this.aggregationThird=aggregationThird;
    }
    void display()
    {
        System.out.println("id="+aggregationDemo.id+"\nname="+aggregationDemo.name+
                "\ncity="+city+"\nzipcode="+zipcode+
                "\naddress="+aggregationSecond.address+"\nState="+aggregationSecond.state+
                "\nphone="+aggregationThird.phone);
    }

    public static void main(String[] args) {
        AggregationDemo aggregationDemo=new AggregationDemo(1,"shraddha");
        AggregationSecond aggregationSecond=new AggregationSecond("Warje","maharashtra");
        AggregationThird aggregationThird=new AggregationThird(232654);
        Student student=new Student("pune",411050,aggregationDemo,aggregationSecond,aggregationThird);
        student.display();
    }
}
