package com.thoughtworks.bank;

public class Account {
  private final String accountHolder;
  private final double accountNumber;
  private double balance;

  public Account(String accountHolder, double accountNumber, double balance) throws MinimumBalanceException {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    if(balance <= 1000)
      throw new MinimumBalanceException();
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public double getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }
}
