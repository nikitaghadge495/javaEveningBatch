package src;

public class threadex6 extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        threadex6 t1 = new threadex6();
        threadex6 t2 = new threadex6();
        threadex6 t3 = new threadex6();
//        t1.run();
//        t2.run();
        t1.start();
        t3.start();

        try{
            t1.join();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        t2.start();

    }
}
