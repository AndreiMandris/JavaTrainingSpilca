package designpatterns.behavioral.chainofresponsibility.atm;

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain(new HundredBillWithrawal(),
                new FiftyBillWithdrawal(),
                new TwentyBillWithdrawal(),
                new FiveBillWithdrawal(),
                new OneBillWithdrawal());

        chain.executeWithrawal(274);
    }
}
