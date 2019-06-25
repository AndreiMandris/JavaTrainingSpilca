package anonime;

public class Main { // se compileaza clasa Main.class
    public static void main(String[] args) {
        int a = 10;
        Interfata interfata = new Interfata() { // aici se mai compileaza inca o clasa (Main$1.class)
            @Override
            public void method1() {
                System.out.println(a); // a is automatically final (effectively final) because it has been used inside the anonymous class
                System.out.println("a");
            }
        };
        interfata.method1();
    }
}
