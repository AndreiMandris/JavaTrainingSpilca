package multithreading.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Producer producer1 = new Producer("producer1");
        Producer producer2 = new Producer("producer1");
        Producer producer3 = new Producer("producer1");
        Consumer consumer1 = new Consumer("consumer1");
        Consumer consumer2 = new Consumer("consumer1");
        Consumer consumer3 = new Consumer("consumer1");

        producer1.start();
        consumer1.start();
        producer2.start();
        consumer2.start();
        producer3.start();
        consumer3.start();
    }
}
