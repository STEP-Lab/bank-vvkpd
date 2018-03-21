package com.thoughtworks.bank;

public class Account {
  private final String accountHolder;
  private final String accountNumber;
  private double balance;

  public Account(String accountHolder, String accountNumber, double balance) throws MinimumBalanceException, AccountNumberException {
    if (!accountNumber.matches("^\\d{4}-\\d{4}$"))
      throw new AccountNumberException(accountNumber);
    if(balance <= 1000)
      throw new MinimumBalanceException();
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }



  public double getBalance() {
    return balance;
  }

  public String getAccountNumber() {
    return accountNumber;
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
