package multithreading.executors;

import java.util.concurrent.*;

public class ExampleCallable {
    public static void main(String[] args) {
        Callable callable = () -> queryForSomeValue();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> taskResult = executorService.submit(callable); //the task runs async



        //instructions

        try {
            String result = taskResult.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }


    }

    public static String queryForSomeValue(){
        return "VALUE";
    }
}
