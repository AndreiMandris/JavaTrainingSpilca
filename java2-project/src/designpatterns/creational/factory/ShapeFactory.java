package designpatterns.creational.factory;

public class ShapeFactory {
    public static enum Types {
        RECTANGLE, TRIANGLE
    }

    public Shape createShape(Types type) throws IllegalArgumentException {
        switch (type) {
            case RECTANGLE: return new Rectangle();
            case TRIANGLE: return new Triangle();
            default: throw new IllegalArgumentException();
        }
    }
}
