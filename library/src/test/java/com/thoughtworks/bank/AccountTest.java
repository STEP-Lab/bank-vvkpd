package com.thoughtworks.bank;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {
  private Account pandey;
  @Before
  public void setUp() throws MinimumBalanceException, AccountNumberException {
    pandey = Account.create("pandey", AccountNumber.createAccountNumber("1234-1234"), 2000);
  }

  @Test(expected = MinimumBalanceException.class)
  public void checkMinimumBalException() throws MinimumBalanceException, AccountNumberException {
    Account.create("pandey", AccountNumber.createAccountNumber("1234-1344"),1000.0d);
  }

  @Test
  public void checkBalance() {
    assertThat(pandey.getBalance(),is(2000.0));
  }

  @Test
  public void checkAccountHolder() {
    assertThat(pandey.getAccountHolder(),is("pandey"));
  }

  @Test
  public void checkDebit() throws InvalidAmountException {
    assertThat(pandey.getBalance(),is(2000.0));
    assertThat(pandey.debit(200),is(1800.0));
  }

  @Test(expected = InvalidAmountException.class)
  public void checkDebitForInvalidAmount() throws InvalidAmountException {
    assertThat(pandey.getBalance(),is(2000.0));
    assertThat(pandey.debit(2100),is(1800.0));
  }

  @Test
  public void checkCredit() throws InvalidAmountException {
    assertThat(pandey.getBalance(),is(2000d));
    assertThat(pandey.credit(200),is(2200d));
  }

  @Test(expected = InvalidAmountException.class)
  public void checkCreditForInvalidAmount() throws InvalidAmountException {
    assertThat(pandey.getBalance(),is(2000.0));
    pandey.credit(-100);
    assertThat(pandey.getBalance(),is(2000.0));
  }
}
