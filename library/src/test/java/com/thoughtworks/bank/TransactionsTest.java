package com.thoughtworks.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class TransactionsTest {

  @Test
  public void checkDebitTransaction() {
    Transactions transactions = new Transactions();
    transactions.debit(2000);
    assertThat(transactions.getTransactions(),hasItem(new DebitTransaction(2000)));
  }

  @Test
  public void checkCreditTransaction() {
    Transactions transactions = new Transactions();
    transactions.credit(2000);
    assertThat(transactions.getTransactions(),hasItem(new CreditTransaction(2000)));
  }

  @Test
  public void checkCreditAndDebitTransaction() {
    Transactions transactions = new Transactions();
    transactions.credit(2000);
    transactions.debit(2000);
    assertThat(transactions.getTransactions(),hasItems(new CreditTransaction(2000),new DebitTransaction(2000)));
  }
}