package multithreading.atomicWrappers;

import java.util.concurrent.atomic.AtomicInteger;

public class IntegerExample implements Runnable{

    private AtomicInteger atomicInteger;

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++){
            System.out.println(atomicInteger.incrementAndGet());
        }
    }
}
