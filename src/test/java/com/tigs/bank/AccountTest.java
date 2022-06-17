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

}
