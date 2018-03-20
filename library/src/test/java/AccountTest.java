import com.thoughtworks.bank.Account;
import com.thoughtworks.bank.MinimumBalanceException;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {
  private Account pandey;
  @Before
  public void setUp() throws MinimumBalanceException {
    pandey = new Account("pandey", 1234, 2000);
  }

  @Test(expected = MinimumBalanceException.class)
  public void checkException() throws MinimumBalanceException {
    pandey = new Account("pandey", 1234, 1000);
  }

  @Test
  public void getBalance() {
    assertThat(pandey.getBalance(),is(2000.0));
  }

  @Test
  public void getAccountNumber() {
    assertThat(pandey.getAccountNumber(),is(1234.0));
  }

  @Test
  public void getAccountHolder() {
    assertThat(pandey.getAccountHolder(),is("pandey"));
  }
}
