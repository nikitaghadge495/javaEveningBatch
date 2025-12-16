package src;

public class PrintDtails extends Thread
{
    public  static synchronized void printTable(String s) //synchronized use for entire method
    {
       //user for specific block of code

            for(int i =1;i<=5;i++) {
                System.out.println("Good Morning");
                System.out.println(s);
                try {
                    Thread.sleep(600);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
    }

}
class myThread1 extends Thread
{
    PrintDtails p;
    String s ;
    myThread1( PrintDtails p, String s)
    {
        this.p =p;
        this.s = s;
    }
    public void run()
    {
        p.printTable(s);
    }
}


class TestTable1{
    public static void main(String[] args) {
        PrintDtails obj1 = new PrintDtails();
        PrintDtails obj2 = new PrintDtails();
        myThread1 t1 = new myThread1(obj1,"Nikita");
        myThread1 t2 = new myThread1(obj2,"Saurabh");
        t1.start();
        t2.start();
    }
}

