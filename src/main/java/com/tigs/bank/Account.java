package com.tigs.bank;

import java.time.LocalDateTime;

public class Account {

    private Money balance;

    public void deposit(double depo) {
        if (depo < 0) {
            throw new IllegalStateException("Unauthorized operation");
        }

           this.balance = this.balance != null ?
            new Money(depo + this.balance.getValue()):
            new Money(depo);

    }

    public double getBalance() {
        return balance.getValue();
    }
}
