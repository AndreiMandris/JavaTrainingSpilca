package multithreading.producerConsumer;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized (Main.list) {
                if (!Main.list.isEmpty()) {
                    int number = Main.list.get(0);
                    Main.list.remove(0);
                    System.out.println("Extracted number is: " + number);
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
