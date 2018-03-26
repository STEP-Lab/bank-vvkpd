package com.thoughtworks.bank;

public class Account {
  private final String accountHolder;
  private final AccountNumber accountNumber;
  private Transactions transactions;
  private double balance;

  private Account(String accountHolder, AccountNumber accountNumber, double balance) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.transactions = new Transactions();
  }

  public static Account create(String accountHolder, AccountNumber accountNumber, double balance) throws MinimumBalanceException {
    if(balance <= 1000)
      throw new MinimumBalanceException();
    return new Account(accountHolder,accountNumber,balance);
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public double debit(double amount) throws InvalidAmountException {
    if (!(amount >= balance)){
      transactions.debit(amount);
      return balance -= amount;
    }
    throw new InvalidAmountException(amount);
  }
}
