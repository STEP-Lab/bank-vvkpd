package com.thoughtworks.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.*;

public class TransactionsTest {

  @Test
  public void checkDebitTransaction() {
    Transactions transactions = new Transactions();
    transactions.debit(2000);
    assertThat(transactions.getTransactions(),hasItem(new DebitTransaction(2000)));
  }
}