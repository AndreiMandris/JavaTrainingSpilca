package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .withColor("RED")
                .build();

       }
}
