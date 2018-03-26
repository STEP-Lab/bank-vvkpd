package com.thoughtworks.bank;

import java.util.Date;
import java.util.Objects;

public abstract class Transaction {
  private final double amount;
  private final Date date;

  public Date getDate() {
    return date;
  }

  protected Transaction(double amount) {
    this.amount = amount;
    this.date = new Date();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Transaction that = (Transaction) o;
    return Double.compare(that.amount, amount) == 0 &&
            Objects.equals(date, that.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date);
  }
}
