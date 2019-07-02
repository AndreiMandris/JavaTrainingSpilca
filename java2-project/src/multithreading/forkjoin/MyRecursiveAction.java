package multithreading.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

    private List<Integer> list;

    private int x;

    public MyRecursiveAction(List list, int x){
        this.list = list;
        this.x = x;
    }

    @Override
    protected void compute() {
            if (x < list.size()) {
                invokeAll(new MyRecursiveAction(list, x + 1),
                        new MyRecursiveAction(list, x + 2));
            }
    }
}
