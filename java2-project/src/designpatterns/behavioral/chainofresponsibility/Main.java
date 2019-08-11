package designpatterns.behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Operation add = new AddOperation();
        Operation substract = new SubstractionOperation();
        Operation mult = new MultiplicationOperation();
        add.setNextChainElement(substract);
        substract.setNextChainElement(mult);

        System.out.println(add.calculate(Operations.DIV, 2, 7));
    }
}
