package designpatterns.behavioral.chainofresponsibility.atm;

public class HundredBillWithrawal implements MoneyWithdrawal {

    private MoneyWithdrawal nextChainElement;

    @Override
    public void withdrawAmount(int amount) {
        int remainingAmount = amount % 100;
        System.out.println("Withdrew " + amount / 100 + " bills of one hundred.");
        if (remainingAmount != 0)
            nextChainElement.withdrawAmount(remainingAmount);
    }

    @Override
    public void setNextChainElement(MoneyWithdrawal nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
