package com.tigs.bank;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Account {

    private Money balance;
    private Money amount;
    private LocalDateTime date;
    private final List<OperationHistoric> operationsHistoric = new ArrayList<>();

    public void deposit(double depo) {
        if (depo < 0) {
            throw new IllegalStateException("Unauthorized operation");
        }

           this.balance = this.balance != null ?
            new Money(depo + this.balance.getValue()):
            new Money(depo);

        this.amount = new Money(depo);
        this.date = LocalDateTime.now();

        operationsHistoric.add(new OperationHistoric(this.amount, this.balance, LocalDateTime.now(), "Deposit"));


    }

    public void withdrawal(double d) {
        if (this.balance == null || this.balance.getValue() < d) {
            throw new IllegalStateException("Unauthorized operation");
        }

        this.balance = new Money(this.balance.getValue() - d);
        this.amount = new Money(d);
        this.date = LocalDateTime.now();
        operationsHistoric.add(new OperationHistoric(this.amount, this.balance, LocalDateTime.now(), "Withdrwal"));
    }


    public void printHistoric() {
        operationsHistoric.forEach(System.out::println);
    }

    public double getBalance() {
        return balance.getValue();
    }
}
