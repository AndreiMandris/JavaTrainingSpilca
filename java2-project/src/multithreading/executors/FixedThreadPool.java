package multithreading.executors;

import java.util.*;
import java.util.concurrent.*;

public class FixedThreadPool {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,1,3,5,63,2);

        Callable callable = () -> list.stream().reduce(0, (a, b) -> a + b);

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = service.submit(callable);
        Future<Integer> future2 = service.submit(callable);
        Future<Integer> future3 = service.submit(callable);

        try {
            System.out.println(future1.get() + " " + future2.get() + " " + future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }
}
