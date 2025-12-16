package src;

public class threadexsyn extends Thread {
    int amount = 10000;
     synchronized void withdraw(int amount)
     {
         System.out.println("Going to withdraw....");
         if(this.amount < amount)
         {
             System.out.println("less balance,waiting for deposit");
             try{
                 wait();
             }
             catch (Exception e)
             {
                 System.out.println(e);
             }
         }
         this.amount -= amount;
         System.out.println("withdrawal completed");
     }
     synchronized void Deposit(int amount)
     {
         System.out.println("going to deposit....");
         this.amount+=amount;
         System.out.println("Deposit completed...");
         notify();
     }
}
class testITC{
    public static void main(String[] args) {
        final threadexsyn obj = new threadexsyn();
        new Thread()
        {
            public void run()
            {
                obj.withdraw(15000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                obj.Deposit(10000);
            }
        }.start();
    }
}
