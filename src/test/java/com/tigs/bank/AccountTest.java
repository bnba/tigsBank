package com.tigs.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void should_deposit_money_in_an_account() {

        Account account = new Account();

        account.deposit(200);
        Assertions.assertEquals(200, account.getBalance());

    }

    @Test
    void should_deposit_money_in_an_account_already_received_money() {

        Account account = new Account();

        account.deposit(200);
        account.deposit(300);

        Assertions.assertEquals(500, account.getBalance());

    }

    @Test
    void should_throw_exception_when_deposit_bad_money() {
        Account account =  new Account();

        Assertions.assertThrows(IllegalStateException.class, () -> account.deposit(-100));
    }

    @Test
    void should_withdrawal_money_in_the_account() {
        Account account = new Account();
        account.deposit(200);

        account.withdrawal(12.2);

        Assertions.assertEquals(187.8, account.getBalance());
    }

    @Test
    void should_not_withdrawal_more_than_the_amount_in_the_account() {
        Account account = new Account();
        account.deposit(200);
        Assertions.assertThrows(IllegalStateException.class, () -> account.withdrawal(300));
    }


}