import com.thoughtworks.bank.Account;
import com.thoughtworks.bank.AccountNumberException;
import com.thoughtworks.bank.InvalidAmountException;
import com.thoughtworks.bank.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {
  private Account pandey;
  @Before
  public void setUp() throws MinimumBalanceException, AccountNumberException {
    pandey = new Account("pandey", "1234-1234", 2000);
  }

  @Test(expected = MinimumBalanceException.class)
  public void checkMinimumBalException() throws MinimumBalanceException, AccountNumberException {
    new Account("pandey","1234-1344",1000.0d);
  }

  @Test(expected = AccountNumberException.class)
  public void checkAccNumberException() throws MinimumBalanceException, AccountNumberException {
     new Account("pandey","1234",3000);
  }

  @Test
  public void checkBalance() {
    assertThat(pandey.getBalance(),is(2000.0));
  }

  @Test
  public void checkAccountNumber() {
    assertThat(pandey.getAccountNumber(),is("1234-1234"));
  }

  @Test
  public void checkAccountHolder() {
    assertThat(pandey.getAccountHolder(),is("pandey"));
  }

  @Test
  public void debit() throws InvalidAmountException {
    assertThat(pandey.getBalance(),is(2000.0));
    assertThat(pandey.debit(200),is(1800.0));
  }
}
