package TestNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFirstClass {
  @BeforeTest
  public void CareLogin() {
System.out.println("Care Login Done Successful");
  }
  @AfterTest
  public void CareLogout() {
System.out.println("Care Log Out Successful");
  }
  @Test (priority = 1)
  public void CreateCustomer() {
System.out.println("Customer Created successful");
  }
  @Test (priority = 2)
  public void WOCreation() {
System.out.println("Work Order Creation Successful");
  }
  @Test (priority = 3)
  public void  WOActivation(){
System.out.println("Activate Work Order Successful");
  }
}
