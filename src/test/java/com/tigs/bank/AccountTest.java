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

}