package reflection;

public class Point {
    private int x;
    private int y;

    private Point(){
    }

    private void showCoordinates(){
        System.out.println(x + " " + y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
