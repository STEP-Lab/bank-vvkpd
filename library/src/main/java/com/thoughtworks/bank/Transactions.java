package com.thoughtworks.bank;

import java.util.ArrayList;

public class Transactions {
  private ArrayList<Transaction> transactions;
  Transactions() {
    this.transactions = new ArrayList<>();
  }

  public void debit(double amount) {
    transactions.add(new DebitTransaction(amount));
  }

  public ArrayList<Transaction> getTransactions() {
    return transactions;
  }

  public void credit(double amount) {
    transactions.add(new CreditTransaction(amount));
  }
}
