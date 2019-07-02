package multithreading.executors;

public class MyRunnable implements Runnable {

    private int x;

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++){
            try {
                x++;
                System.out.println(x);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
