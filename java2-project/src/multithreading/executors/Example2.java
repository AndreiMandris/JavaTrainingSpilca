package multithreading.executors;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Example2 {
    public static List<Integer> list = Arrays.asList(2, 4, 5, 7);

    public static void main(String[] args) {


        Callable callable = () -> list.stream().mapToInt(x -> x).sum();

        Callable myCallable = new MyCallable();

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(myCallable);

        int result;
        try {
           result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }

}
