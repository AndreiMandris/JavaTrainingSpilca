package multithreading.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main implements Runnable{

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++){
            try {
                cyclicBarrier.await();
                System.out.println(i);
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
