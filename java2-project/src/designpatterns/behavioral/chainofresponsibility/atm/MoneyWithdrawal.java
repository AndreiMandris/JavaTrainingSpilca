package designpatterns.behavioral.chainofresponsibility.atm;

public interface MoneyWithdrawal {
    void withdrawAmount(int amount);
    void setNextChainElement(MoneyWithdrawal nextChainElement);
}
