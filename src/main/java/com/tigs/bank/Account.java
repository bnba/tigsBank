package com.tigs.bank;

import java.time.LocalDateTime;

public class Account {

    private Money balance;

    public void deposit(double depo) {
        if (depo < 0) {
            throw new IllegalStateException("Unauthorized operation");
        }

        if (this.balance != null) {
            this.balance = new Money(depo + this.balance.getValue());
        } else {
            this.balance = new Money(depo);
        }
    }

    public double getBalance() {
        return balance.getValue();
    }
}
