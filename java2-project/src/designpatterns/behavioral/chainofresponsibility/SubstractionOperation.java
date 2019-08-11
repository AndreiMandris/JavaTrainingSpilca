package designpatterns.behavioral.chainofresponsibility;

public class SubstractionOperation implements Operation {

    private Operation nextChainElement;

    @Override
    public double calculate(Operations operation, int nr1, int nr2) {
        return Operations.SUBSTRACTION == operation ? nr1 - nr2 : nextChainElement.calculate(operation, nr1, nr2);
    }

    @Override
    public void setNextChainElement(Operation nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
