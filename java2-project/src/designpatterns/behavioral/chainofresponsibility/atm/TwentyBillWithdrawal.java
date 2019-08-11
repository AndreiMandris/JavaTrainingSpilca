package designpatterns.behavioral.chainofresponsibility.atm;

public class TwentyBillWithdrawal implements MoneyWithdrawal {

    private MoneyWithdrawal nextChainElement;

    @Override
    public void withdrawAmount(int amount) {
        int remainingAmount = amount % 20;
        System.out.println("Withdrew " + amount / 20 + " bills of twenty.");
        if (remainingAmount != 0)
            nextChainElement.withdrawAmount(remainingAmount);
    }

    @Override
    public void setNextChainElement(MoneyWithdrawal nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
