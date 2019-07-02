package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();
        String hi = null;
        Optional<String> optional2 = Optional.of(hi);
        Optional<String> optional3 = Optional.ofNullable("yo");

        optional3.ifPresent(x -> System.out.println(x)) ;
        optional2.filter(x -> x.length() % 2 == 0).ifPresent(System.out::println);

        System.out.println(optional2.map(String::length).orElse(-1));
    }
}
