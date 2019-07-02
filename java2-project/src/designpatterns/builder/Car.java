package designpatterns.builder;

public class Car {
    private String color;
    private int hp;
    private int noOfDoors;

    private Car(){
    }

    public static class CarBuilder {

        private Car myCar;

        public CarBuilder(){
            myCar = new Car();
        }

        public CarBuilder withColor(String color) {
            myCar.color = color;
            return this;
        }

        public CarBuilder withHp(int hp) {
            myCar.hp = hp;
            return this;
        }

        public CarBuilder withNoOfDoors(int noOfDoors) {
            myCar.noOfDoors = noOfDoors;
            return this;
        }

        public Car build(){
            return myCar;
        }
    }
}
