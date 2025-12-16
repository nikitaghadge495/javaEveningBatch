package src;

public class runnabledemo implements  Runnable
{
    @Override
    public void run()
    {
        System.out.printf("Runnable method is running");
    }
    public static void main(String args[])
    {
        runnabledemo r1 = new runnabledemo();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}

