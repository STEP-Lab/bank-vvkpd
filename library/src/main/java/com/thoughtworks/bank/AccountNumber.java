package com.thoughtworks.bank;

public class AccountNumber {
  public AccountNumber(String accNumber) throws AccountNumberException {
    validateAccountNumber(accNumber);
  }

  private void validateAccountNumber(String accNumber) throws AccountNumberException {
    if (!accNumber.matches("^\\d{4}-\\d{4}$"))
      throw new AccountNumberException(accNumber);
  }
}
