package nestedClasses;

public class A1 {
    private int x;

    public class A2 extends A1{
        int x;
        public void method1(){
            x = 10;
            this.x = 10;
            A1.this.x = 10;
        }
    }

    public void method1(){
        x = 2;
    }
    static class A3{

    }

    interface I1{
        int y = 2;
        static void m1(){

        }
    }
}
