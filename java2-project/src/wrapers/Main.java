package wrapers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void m1(Integer i1){

    }
    public static void m2(int i1){

    }

    public static void main(String[] args) {
        List<? extends Integer> list1 = new ArrayList<>();

        short s = 14;
        m1(10);
        m2(s);
        int[] a = new int[10];
        System.out.println(a instanceof Object);
    }
}
