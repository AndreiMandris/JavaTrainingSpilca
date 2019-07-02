package multithreading;

public class Deadlock {

    private static Object obj1 = new Object();
    private static Object obj2 = new Object();
    
    private static void method1(){
        while(true) {
            synchronized (obj1) {
                System.out.println("bla");
                synchronized (obj2) {
                    System.out.println("blahh");
                }
            }
        }
    }

    private static void method2(){
        while(true) {
            synchronized (obj2) {
                System.out.println("bla");
                synchronized (obj1) {
                    System.out.println("blahh");
                }
            }
        }
    }

    static Thread t1 = new Thread(Deadlock::method1);
    static Thread t2 = new Thread(Deadlock::method2);

    public static void main(String[] args) {
        t1.start();
        t2.start();
    }

}
