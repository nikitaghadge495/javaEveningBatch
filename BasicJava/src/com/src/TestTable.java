package src;

class Table extends Thread {
    void printTable(int n) //synchronized use for entire method
    {
        synchronized(this)//user for specific block of code
        {
            for(int i =1;i<=5;i++)
            {
                System.out.println(n*i);
                try
                {
                    Thread.sleep(600);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }

            }
        }
        System.out.println("others calculations in printTable method");
        for(int i =1;i<=5;i++)
        {
            System.out.println(n*i);
            try
            {
                Thread.sleep(600);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

        }


    }

}
class myThread extends Thread
{
    Table t;
    myThread( Table t)
    {
        this.t =t;
    }
     public void run()
     {
         t.printTable(10);
     }
}
class myThread2 extends Thread
{
    Table t;
    myThread2( Table t)
    {
        this.t =t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class TestTable{
    public static void main(String[] args) {
        Table obj = new Table();
        myThread t1 = new myThread(obj);
        myThread2 t2 = new myThread2(obj);
        t1.start();
        t2.start();
    }
}