import com.thoughtworks.bank.AccountNumber;
import com.thoughtworks.bank.AccountNumberException;
import org.junit.Test;

public class AccountNumberTest {
  @Test
  public void checkValidAccNumberException() throws AccountNumberException {
    AccountNumber.createAccountNumber("1234-1234");
  }

  @Test(expected = AccountNumberException.class)
  public void checkInvalidAccNumber() throws AccountNumberException {
    AccountNumber.createAccountNumber("1234");
  }

  @Test(expected = AccountNumberException.class)
  public void checkInvalidAccountNumber() throws AccountNumberException {
    AccountNumber.createAccountNumber("123-4hello*");
  }
}
