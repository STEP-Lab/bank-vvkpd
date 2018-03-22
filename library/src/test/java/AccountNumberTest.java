import com.thoughtworks.bank.AccountNumber;
import com.thoughtworks.bank.AccountNumberException;
import org.junit.Test;

public class AccountNumberTest {
  @Test
  public void checkValidAccNumberException() throws AccountNumberException {
    new AccountNumber("1234-1234");
  }

  @Test(expected = AccountNumberException.class)
  public void checkInvalidAccNumber() throws AccountNumberException {
    new AccountNumber("1234");
  }

  @Test(expected = AccountNumberException.class)
  public void checkInvalidAccountNumber() throws AccountNumberException {
    new AccountNumber("123-4hello*");
  }
}
