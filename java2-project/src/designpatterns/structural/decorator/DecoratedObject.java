package designpatterns.structural.decorator;

public class DecoratedObject implements DecoratorInterface {

    @Override
    public void doSomething(){
        System.out.println("Do something!");
    }
}
