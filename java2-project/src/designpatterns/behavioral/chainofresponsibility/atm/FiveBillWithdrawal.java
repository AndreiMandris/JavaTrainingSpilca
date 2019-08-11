package designpatterns.behavioral.chainofresponsibility.atm;

public class FiveBillWithdrawal implements MoneyWithdrawal{
    private MoneyWithdrawal nextChainElement;

    @Override
    public void withdrawAmount(int amount) {
        int remainingAmount = amount % 5;
        System.out.println("Withdrew " + amount / 5 + " bills of five.");
        if (remainingAmount != 0)
            nextChainElement.withdrawAmount(remainingAmount);
    }

    @Override
    public void setNextChainElement(MoneyWithdrawal nextChainElement) {
        this.nextChainElement = nextChainElement;
    }
}
