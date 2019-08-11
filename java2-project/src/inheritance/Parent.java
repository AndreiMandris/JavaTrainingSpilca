package inheritance;

public class Parent {

    String a = "aa";

    {
        a = "asdas";
    }
    public void hahaha(){
        String nr = "a";
        nr = "ab";
        nr = "aaa";
    }

    class Inner {
        {
        a = "aaa";

        }
    }

    public static void main(String[] args) {
        Parent[] parents = new Child[5];
    }
}
