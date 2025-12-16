package src;

public class threadex3 extends Thread
{
    public void run()
    {
        System.out.println("this thread is running");
    }
    public static  void main(String args[])
    {
        threadex3 t2 = new threadex3();
        Thread t1 = new Thread(t2,"this is a Thread");
        t1.start();
        String s1 = t1.getName();
        System.out.println(s1);
    }

}
