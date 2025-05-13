package infosys;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	@BeforeGroups(groups = "tc1")
	public void beforegroup() {
		System.out.println("Before groups");
	}
	
	@BeforeMethod
	public void aftermethod() {
		System.out.println("Before Method");
	}
	@BeforeClass
	public void afterclass() {
		System.out.println("Before Class");
	}
	@BeforeTest
	public void aftertest() {
		System.out.println("Before Test");
	}
	@Test()
	public void tc1() {
		System.out.println("Testing");
	}
	@Test(groups = "tc1")
	public void tc2() {
		System.out.println("Testing");
	}
}
