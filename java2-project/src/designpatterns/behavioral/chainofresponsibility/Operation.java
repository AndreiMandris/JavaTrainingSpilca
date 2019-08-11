package designpatterns.behavioral.chainofresponsibility;

public interface Operation {
    double calculate(Operations operation, int nr1, int nr2);

    void setNextChainElement(Operation nextChainElement);
}
