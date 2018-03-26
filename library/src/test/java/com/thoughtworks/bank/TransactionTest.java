package com.thoughtworks.bank;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TransactionTest {
  @Test
  public void checkTransactionDate() {
    DebitTransaction debitTransaction = new DebitTransaction(2000);
    assertThat(debitTransaction.getDate().toString(),is(new Date().toString()));
  }
}