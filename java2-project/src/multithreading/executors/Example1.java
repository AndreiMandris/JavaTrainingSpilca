package multithreading.executors;

import java.util.concurrent.*;

public class Example1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        MyRunnable myRunnable = new MyRunnable();

        executorService.execute(myRunnable);

        executorService.shutdown();
    }

}
