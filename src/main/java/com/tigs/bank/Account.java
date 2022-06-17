package com.tigs.bank;

import java.time.LocalDateTime;

public class Account {

    private Money balance;

    public void deposit(double d) {
        if (this.balance != null) {
            this.balance = new Money(d + this.balance.getValue());
        } else {
            this.balance = new Money(d);
        }
    }

    public double getBalance() {
        return balance.getValue();
    }
}
