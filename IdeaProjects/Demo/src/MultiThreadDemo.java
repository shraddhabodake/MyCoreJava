/**
 * Created by shraddha on 26/10/17.
 */
public class MultiThreadDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hiiiii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Multi extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hellooooo");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreadDemo multiThreadDemo=new MultiThreadDemo();
        Multi multi=new Multi();
        multiThreadDemo.setName("pradnya");
        multi.setName("shraddha");
        multiThreadDemo.setPriority(MAX_PRIORITY);
        multi.setPriority(MIN_PRIORITY);

        multiThreadDemo.start();

       // System.out.println(multiThreadDemo.isAlive());
       // multiThreadDemo.join();
        System.out.println(multiThreadDemo.getName());


        multi.start();
       // multi.join();
       // System.out.println(multi.isAlive());
        System.out.println(multi.getName());
//multiThreadDemo.getPriority();
//multi.getPriority();

    }
}
