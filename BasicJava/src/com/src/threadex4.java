package src;

public class threadex4 implements Runnable{
    public void run()
    {
        System.out.println("this Runnable interface is running");
    }
    public static  void main(String args[])
    {
        threadex4 t2 = new threadex4();
        Thread t1 = new Thread(t2,"this is a Thread");
        t1.start();
        String  s1 = t1.getName();
        System.out.println("this is a thread");
    }
}
