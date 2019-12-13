package com.company;

public class PremiunAccount extends Account {
    private int dateToExpireSubscription;
    private int bonus = 10;

    public PremiunAccount(int balans, String status, int dateToExpireSubscription) {
        super(balans, status);
        this.dateToExpireSubscription = dateToExpireSubscription;
    }

    @Override
    public boolean increaseBalans(int amount) {
        if (amount < 0) return false;
        int bonusSumm = amount * bonus /100;
        return super.increaseBalans(amount) && super.increaseBalans(bonusSumm);

    }
}
