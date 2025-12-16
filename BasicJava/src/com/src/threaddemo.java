package src;

public class threaddemo extends Thread
{
    public void run()
    {
        System.out.printf("thread is running");
    }
    public static void main(String args[])
    {
        threaddemo t1= new threaddemo();
        t1.start();
    }
}
