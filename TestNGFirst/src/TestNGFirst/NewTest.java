package TestNGFirst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeClass
  public void Login() {
	  System.out.println("Login Successful");
  }
  @AfterClass
  public void Logout() {
	  System.out.println("logout Successful");
  }
  @Test (priority = 1)
  public void Recharge() {
	  System.out.println("Recharge Successful");
  }
  @Test (priority = 3)
  public void Balance() {
	  System.out.println("Balance got Successful");
  }
  @Test (priority = 2)
  public void Message() {
	  System.out.println("Message got Successful");
  }
}
