package src;

public class threadex8 extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            try{
                Thread.sleep(500);
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
        threadex8 t1=new threadex8();
        threadex8 t2=new threadex8();
        threadex8 t3=new threadex8();
        t1.run();
        t2.run();
        t3.run();


    }
}
