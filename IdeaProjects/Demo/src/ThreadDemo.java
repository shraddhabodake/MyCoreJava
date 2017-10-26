/**
 * Created by shraddha on 25/10/17.
 */
public class ThreadDemo extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            try
            {

                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("codekul");
        }
    }
}
    class Abc extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("institute");
            }
        }
    }

        class xyz {

            public static void main(String[] args) {
                ThreadDemo threadDemo = new ThreadDemo();
                Abc abc=new Abc();
                threadDemo.start();
                abc.start();
            }
        }