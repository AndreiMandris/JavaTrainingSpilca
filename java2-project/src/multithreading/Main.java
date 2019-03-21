package multithreading;

public class Main {

    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 50000) {
            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable1);
        Thread t3 = new Thread(runnable1);
        Thread t4 = new Thread(runnable1);
        Thread t5 = new Thread(runnable1);
        Thread t6 = new Thread(runnable1);
        Thread t7 = new Thread(runnable1);
        Thread t8 = new Thread(runnable1);
        System.out.println("this is main thread");
        Long startingTime = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - startingTime);
    }
}
