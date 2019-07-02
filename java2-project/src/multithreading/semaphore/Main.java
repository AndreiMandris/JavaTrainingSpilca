package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Main implements Runnable{

    private Semaphore semaphore = new Semaphore(1);

    private int number;

    @Override
    public void run() {
        for(int i = 0; i <= 50; i++){
            try {
                semaphore.acquire();
                number++;
                System.out.println(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
