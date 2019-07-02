package functionalInterfaces;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Predicat p1 = x -> false; //here it is anonymously instantiated the interface Predicate through lambda expression
        Predicat p2 = x -> x % 2 == 0;
        System.out.println(p2.test(5));

        Functie f1 = (x, y) -> x + y;
        displayOperation(f1, 15, 5);
        displayOperation((x, y) -> x * y, 15, 5);

        Stream<String> s1 = Stream.of("andr", "merg", "acas");
        boolean hasAllElementsWithEvenLength = s1.map(String::length).allMatch(x -> x % 2 == 0);
        System.out.println(hasAllElementsWithEvenLength);
    }

    private static void displayOperation(Functie f, int a, int b){
        System.out.println(f.operatie(a, b));
    }

}
