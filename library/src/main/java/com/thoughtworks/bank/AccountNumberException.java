package com.thoughtworks.bank;

public class AccountNumberException extends Throwable {
  public AccountNumberException(String cause) {
    super("Invalid Account Number"+cause);
  }
}
