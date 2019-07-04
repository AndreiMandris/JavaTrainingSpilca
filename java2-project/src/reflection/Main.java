package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class pointClass = Class.forName("reflection.Point"); //needs the complete naming of the class from the classpath
        //this instance is equivalent to the one from Permgeneration, based on it Java creates instances.

        Constructor constructor = pointClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Point p1 = (Point) constructor.newInstance();
        Field xField = pointClass.getDeclaredField("x");
        xField.setAccessible(true);
        xField.set(p1, 10);

        Field yField = pointClass.getDeclaredField("y");
        yField.setAccessible(true);
        yField.set(p1, 20);

        Method m1 = pointClass.getDeclaredMethod("showCoordinates");
        m1.setAccessible(true);
        m1.invoke(p1);
    }
}
