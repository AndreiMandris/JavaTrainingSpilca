package multithreading.producerConsumer;

import java.util.Random;

public class Producer extends Thread {

    private Random random = new Random();

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized (Main.list) {
                if (Main.list.size() < 100) {
                    int number = random.nextInt();
                    Main.list.add(number);
                    System.out.println("The number introduced is: " + number);
                    Main.list.notifyAll();
                } else {
                    try {
                        Main.list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
