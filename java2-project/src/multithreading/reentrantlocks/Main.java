package multithreading.reentrantlocks;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main implements Runnable {

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private int value;
    private int sum;
    private Random random = new Random();

    @Override
    public void run() {
        for(int i = 0; i <= 50; i++){
            changeValue();
            readValue();
        }
    }

    public void changeValue(){
        reentrantReadWriteLock.writeLock().lock();
        value = random.nextInt();
        reentrantReadWriteLock.writeLock().unlock();
    }

    public void readValue(){
        reentrantReadWriteLock.readLock().lock();
        sum = sum + value;
        reentrantReadWriteLock.readLock().unlock();
    }

}
