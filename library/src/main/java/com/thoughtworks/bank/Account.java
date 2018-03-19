package com.thoughtworks.bank;

public class Account {
  private final String accountHolder;
  private final double accountNumber;
  private double balance;

  public Account(String accountHolder, double accountNumber, double balance) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
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
