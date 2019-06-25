package exceptions;

public class MyConnection implements AutoCloseable{

    public MyConnection(){
        System.out.println("connection established");
    }

    @Override
    public void close() {
        System.out.println("connection closed");
    }
}
