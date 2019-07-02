package multithreading.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,342,32,5);

        list.parallelStream().forEachOrdered(System.out::println);

    }
}
