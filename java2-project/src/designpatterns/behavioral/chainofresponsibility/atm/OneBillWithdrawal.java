package designpatterns.behavioral.chainofresponsibility.atm;

public class OneBillWithdrawal implements MoneyWithdrawal{
    private MoneyWithdrawal nextChainElement;

    @Override
    public void withdrawAmount(int amount) {
        System.out.println("Withdrew " + amount + " bills of one.");
    }

    @Override
    public void setNextChainElement(MoneyWithdrawal nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
