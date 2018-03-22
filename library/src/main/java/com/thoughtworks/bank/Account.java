package com.thoughtworks.bank;

public class Account {
  private final String accountHolder;
  private final AccountNumber accountNumber;
  private double balance;

  public Account(String accountHolder, AccountNumber accountNumber, double balance) throws MinimumBalanceException {
    if(balance <= 1000)
      throw new MinimumBalanceException();
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public double debit(double amount) throws InvalidAmountException {
    if (!(amount >= balance))
      return balance -= amount;
    throw new InvalidAmountException(amount);
  }
}
