package com.thoughtworks.bank;

public class InvalidAmountException extends Throwable {
  public InvalidAmountException(double amount) {
    super(String.format("Invalid %s",amount));
  }
}
