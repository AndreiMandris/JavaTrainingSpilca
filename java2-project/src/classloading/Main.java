package classloading;

import java.util.ArrayList;
import java.util.List;

import static classloading.Dog.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(HAM);
        List<Dog> list = new ArrayList<>();
        System.out.println(obj);
    }
}
