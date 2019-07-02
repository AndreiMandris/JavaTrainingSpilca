package functionalInterfaces.collectors;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Counting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bbb", "cc");
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(list.stream().max((s1, s2) -> s1.length() - s2.length()).orElse("ERROR"));
        System.out.println(map);
    }
}
