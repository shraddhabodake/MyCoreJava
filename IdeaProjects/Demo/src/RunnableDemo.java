/**
 * Created by shraddha on 25/10/17.
 */
public class RunnableDemo implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++)
        {
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

            System.out.println("codekul");
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();
    }
}

