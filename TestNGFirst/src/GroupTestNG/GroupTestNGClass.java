package GroupTestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTestNGClass {
	@BeforeGroups (groups = {"Sanity"})
	public void CareLogin()
	{
		System.out.println("Care Login Sucessfull");
	}
	@AfterGroups (groups = {"Regression"})
	public void CareLogout()
	{
		System.out.println("Care Logout Sucessfull");
	}
	@Test (groups = {"Sanity"})
	public void CustCreation()
	{
		System.out.println("Customer creation Sucessfull");

	}
	@Test (groups = {"Sanity", "Regression"})
	public void CustActivation()
	{
		System.out.println("Customer Activation Sucessfull");
	}
	@Test (groups = {"Regression"})
	public void Packageactivation()
	{
		System.out.println("Customer's Packageactivation Sucessfull");
	}
}
