package com.tigs.bank;

import java.time.LocalDateTime;

public class OperationHistoric {
    private Money amount;
    private Money balance;
    private LocalDateTime date;
    private String typeOperation;

    public OperationHistoric(Money amount, Money balance, LocalDateTime date, String typeOperation) {
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.typeOperation = typeOperation;
    }

    @Override
    public String toString() {
        return "OperationHistoric{" +
                "amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                ", typeOperation='" + typeOperation + '\'' +
                '}';
    }
}
