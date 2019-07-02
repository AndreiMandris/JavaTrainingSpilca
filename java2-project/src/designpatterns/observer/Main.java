package designpatterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ListenerInterface listener1 = new ListenerImpl();
        ListenerInterface listener2 = new ListenerImpl();
        ListenerInterface listener3 = new ListenerImpl();

        subject.addListener(listener1);
        subject.addListener(listener2);
        subject.addListener(listener3);

        subject.changeSubject();
    }
}
