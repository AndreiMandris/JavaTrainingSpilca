package multithreading.racecondition;

public class MyRunnable implements Runnable {

    private int x;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            synchronized (this) {
                System.out.println(x++); // here there are more than one instruction (println, sum, assign)
            }
        }
    }
}
