package com.tigs.bank;

public class Account {

    private Money balance;

    public void deposit(double d) {
        this.balance = new Money(d);
    }

    public double getBalance() {
        return balance.getValue();
    }
}
