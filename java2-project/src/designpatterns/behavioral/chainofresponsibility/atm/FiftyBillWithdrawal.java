package designpatterns.behavioral.chainofresponsibility.atm;

public class FiftyBillWithdrawal implements MoneyWithdrawal {

    private MoneyWithdrawal nextChainElement;

    @Override
    public void withdrawAmount(int amount) {
        int remainingAmount = amount % 50;
        System.out.println("Withdrew " + amount / 50 + " bills of fifty.");
        if (remainingAmount != 0)
            nextChainElement.withdrawAmount(remainingAmount);
    }

    @Override
    public void setNextChainElement(MoneyWithdrawal nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
