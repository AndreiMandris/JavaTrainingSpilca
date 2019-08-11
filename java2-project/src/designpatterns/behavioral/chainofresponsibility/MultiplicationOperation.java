package designpatterns.behavioral.chainofresponsibility;

public class MultiplicationOperation implements Operation {

    private Operation nextChainElement;

    @Override
    public double calculate(Operations operation, int nr1, int nr2) {
        return Operations.MULTIPLICATION == operation ? nr1 * nr2 : operationNotSupported(operation);
    }

    @Override
    public void setNextChainElement(Operation nextChainElement) {
        this.nextChainElement = nextChainElement;
    }

    private double operationNotSupported(Operations operation) {
        System.out.println("The requested operation(" + operation.name() + ")  is not currently supported!");
        return -1;
    }
}
