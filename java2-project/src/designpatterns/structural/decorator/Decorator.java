package designpatterns.structural.decorator;

public class Decorator implements DecoratorInterface {

    private DecoratedObject decoratedObject;

    public Decorator(DecoratedObject decoratedObject) {
        this.decoratedObject = decoratedObject;
    }

    @Override
    public void doSomething() {
        System.out.println("Decorate it!!");
    }
}
