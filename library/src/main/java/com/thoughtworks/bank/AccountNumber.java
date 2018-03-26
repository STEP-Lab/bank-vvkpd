package com.thoughtworks.bank;

public class AccountNumber {
  private final String accNumber;
  private AccountNumber(String accNumber) {
    this.accNumber = accNumber;
  }

  public static AccountNumber createAccountNumber(String accNumber) throws AccountNumberException {
    if (!accNumber.matches("^\\d{4}-\\d{4}$"))
      throw new AccountNumberException(accNumber);
    return new AccountNumber(accNumber);
  }
}
