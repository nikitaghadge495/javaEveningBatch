package src;

public class threadex7 {
    public void run() {
//        System.out.println("this is Thread example");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        thredex5 t1 = new thredex5();
        thredex5 t2 = new thredex5();
        thredex5 t3 = new thredex5();

        t2.setPriority(8);
        t1.setPriority(6);
        t3.setPriority(7);

        t1.start();
        t2.start();
        t3.start();

        t1.setName("sinchan");
        t2.setName("rajkumari indumati");
        t3.setName("kaliyaaaa");

        System.out.println("priority of thread 1: " + t1.getPriority());
        System.out.println("priority of thread 2: " + t2.getPriority());
        System.out.println("priority of thread 3: " + t3.getPriority());

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());


    }
}
