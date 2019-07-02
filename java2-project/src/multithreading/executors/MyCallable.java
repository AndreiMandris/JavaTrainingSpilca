package multithreading.executors;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Integer call(){
        return Example2.list.stream().reduce(0, (x, y) -> x + y);
    }
}
