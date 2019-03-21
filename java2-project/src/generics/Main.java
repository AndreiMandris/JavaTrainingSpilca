package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PECS - Producer extends, Consumer super
//        List<? extends Number> extendingList = Arrays.asList(2, 5, 3f); // from this list you can only retrieve values (it's a producer)
//        extendingList.remove(0);
//        extendingList.get(0);
//
//        List<? super Number> list2 = new ArrayList<>(); // this is a consumer, values can be consumed from this list
//        list2.add(2);
//        list2.add(33f);
//        list2.add(0x23);
//
//        List<Number> list3 = new ArrayList<>();
//        list3.add(2f);
//        list3.add(4);
//
//        List<?> list4 = new ArrayList<>();
        Child child = new Child();
        child.field = "23";
        System.out.println(child.field.getClass());
    }

    public void method1(List<?> list){
        System.out.println(list.get(0));
        list.remove(0);
    }

    static class Parent<Q>{
        Q field;
    }

    static class Child extends Parent{

    }
}
