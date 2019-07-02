package classloading;

public class Dog {
    public static final String HAM = "HAAAAM";
    public static final Object obj = new Object();

    {
        System.out.println("HAM HAM!!");
    }

    static {
        System.out.println("HAM HAM STATIC!!");
    }

    public Dog() {
        System.out.println("HAM HAM CONSTRUCTOR");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("sdasd");
    }

    public void bla(){

    }
}
