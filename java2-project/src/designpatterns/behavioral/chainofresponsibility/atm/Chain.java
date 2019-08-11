package designpatterns.behavioral.chainofresponsibility.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chain {
    private List<MoneyWithdrawal> list;

    public Chain(MoneyWithdrawal... listOfMoneySegments) {
        list = new ArrayList<>();
        this.list = Arrays.asList(listOfMoneySegments);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).setNextChainElement(list.get(i + 1));
        }
    }

    public void executeWithrawal(int amount){
        list.get(0).withdrawAmount(amount);
    }
}
