package singleton;

public class Singleton extends Object{
    private static Singleton SINGLETON;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if (SINGLETON == null){
            SINGLETON = new Singleton();
        }
        return SINGLETON;
    }
}
